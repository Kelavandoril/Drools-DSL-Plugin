package kela.plugins.dsl.lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import kela.plugins.dsl.psi.DSLTokenType;import kela.plugins.dsl.psi.DSLTypes;
import com.intellij.psi.TokenType;
import java.util.Stack;
import java.util.List;

%%
%{
    public DSLLexer() {
      this((java.io.Reader)null);
    }
    private final Stack<Integer> stateStack = new Stack<>();

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
SLASH_COMMENT=("//")[^\r\n]*
HASH_COMMENT=("#")[^\r\n\/]*
DEBUG_COMMENT=("#/")[^\r\n]*
SEPARATOR=[=]
STRING_TOKEN=[^\r\n\{\}\=]+
VAR=("\{"{STRING_TOKEN}"\}")
//JAVA_CODE=([^\r\n\$\{\}\=\[\]]";"?)+
//DRL_CODE=("$"?[^\r\n\{\}\=\[\]]";"?)+


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
    "[keyword]" {
        pushState(LHS);
        return DSLTypes.KEYWORD;
    }
}

<LHS> {
    {VAR} {
        return DSLTypes.VARIABLE;
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
//    {JAVA_CODE} {
//        return DSLTypes.JAVA_CODE;
//    }
//    {DRL_CODE} {
//        return DSLTypes.DRL_CODE;
//    }
    {VAR} {
        return DSLTypes.VARIABLE;
    }
}

{SLASH_COMMENT} | {HASH_COMMENT} {
    yybegin(YYINITIAL);
    return DSLTypes.COMMENT;
}

{DEBUG_COMMENT} {
    return DSLTypes.DEBUG_COMMENT;
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