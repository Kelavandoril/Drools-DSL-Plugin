package kela.plugins.drools.dsl.lang.lexer;

import com.intellij.psi.tree.IElementType;
import kela.plugins.drools.dsl.psi.DSLTypes;
import com.intellij.psi.TokenType;
import java.util.Stack;

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
%implements com.intellij.lexer.FlexLexer
%unicode
%function advance
%type IElementType
%eof{   return;
%eof}

%state LHS
%state RHS

CRLF=\R
SLASH_COMMENT=("//")[^\r\n]*{CRLF}?
HASH_COMMENT=("#")[^\/\r\n]*{CRLF}?
DEBUG_COMMENT=("#/")[^\r\n]*
SEPARATOR=[=]
STRING_TOKEN=[^\r\n\;\$\{\}\=]+
VAR=("\{"{STRING_TOKEN}"\}")
JAVA_CODE=[^\r\n\[\]\{\}]+


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
    {JAVA_CODE} {
        return DSLTypes.JAVA;
    }
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