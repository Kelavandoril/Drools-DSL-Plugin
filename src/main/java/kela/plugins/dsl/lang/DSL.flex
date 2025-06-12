package kela.plugins.dsl.lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import kela.plugins.dsl.psi.DSLTokenType;import kela.plugins.dsl.psi.DSLTypes;
import com.intellij.psi.TokenType;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;import java.util.concurrent.atomic.AtomicBoolean;

%%
%{
    public DSLLexer() {
      this((java.io.Reader)null);
    }
    private final Stack<Integer> stateStack = new Stack<>();
    private final List<String> dslVarList = new ArrayList<>();

    private void pushState(int newState) {
        stateStack.push(newState);
        yybegin(newState);
    }

    private void popState() {
        yybegin(stateStack.pop());
    }
%}
%class DSLLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{   return;
%eof}

%state LHS
%state RHS

CRLF=\R
WHITE_SPACE=[\ \n\t\f]
LINE_COMMENT=("#")[^\r\n]*
SEPARATOR=[=]
ALPHA=[:letter:]
NUM=[:digit:]
STRING_TOKEN= [^\r\n\{\}\=]+
LHS_VAR=("\{"{STRING_TOKEN}"\}")
JAVA_CODE=([^\r\n\$\{\}\=\[\]]";"?)+
DRL_CODE=("$"?[^\r\n\{\}\=\[\]]";"?)+


%%
<YYINITIAL> {
     "[when]" {
         pushState(LHS);
         return DSLTypes.WHEN;
     }
    "[then]" {
        pushState(LHS);
        return DSLTypes.THEN;
    }
    {LINE_COMMENT} {
        return DSLTypes.COMMENT;
    }
}

<LHS> {
    {LHS_VAR} {
        String matchedText = yytext().toString();
        dslVarList.add(matchedText);
        System.out.println("Added " + matchedText);
        return DSLTypes.LHS_VARIABLE;
    }
    {STRING_TOKEN} {
        return DSLTypes.STRING_TOKEN;
    }
    {SEPARATOR} {
        pushState(RHS);
        return DSLTypes.EQ;
    }
}

<RHS> {
    {JAVA_CODE} {
        return DSLTypes.JAVA_CODE;
    }
    {DRL_CODE} {
        return DSLTypes.DRL_CODE;
    }
    {LHS_VAR} {
        return DSLTypes.LHS_VARIABLE;
    }
}

{CRLF} {
    yybegin(YYINITIAL);
    return DSLTypes.CRLF;
}

[^] {
    if (stateStack.isEmpty())
        return TokenType.BAD_CHARACTER;
    popState();
    yypushback(yylength());
}