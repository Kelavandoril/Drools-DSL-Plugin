package kela.plugins.drools.dslr.lang.lexer;

import com.intellij.psi.tree.IElementType;
import kela.plugins.drools.dslr.psi.DSLRTypes;
import com.intellij.psi.TokenType;
import java.util.Stack;

%%
%{
    public DSLRLexer() {
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
%class DSLRLexer
%implements com.intellij.lexer.FlexLexer
%unicode
%function advance
%type IElementType
%eof{   return;
%eof}

%state FILE_STATEMENT
%state DECLARE
%state QUERY
%state RULE_HEADER
%state RULE_LHS
%state RULE_RHS

CRLF=\R
SLASH_COMMENT=("//")[^\r\n]*{CRLF}?
HASH_COMMENT=("#")[^\/\r\n]*{CRLF}?
DEBUG_COMMENT=("#/")[^\r\n]*
WHITESPACE=[\ \t\f]
STRING_TOKEN=[^\r\n\;\:\[\]\(\)\$\{\}\=\ \t]+
MONTH=("Jan"|"Feb"|"Mar"|"Apr"|"May"|"Jun"|"Jul"|"Aug"|"Sep"|"Oct"|"Nov"|"Dec")
NUMBER=[:digit:]
// ************** TIMER
MINUTE_IN_HOUR=[0-9]|1[0-9]|2[0-9]|3[0-9]|4[0-9]|5[0-9]
HOUR=[0-9]|1[0-9]|2[0-3]
DAYS_IN_MONTH=[0-9]|1[0-9]|2[0-9]|3[0-1]
MONTHS=([0-9]|1[0-2])|("JAN"|"FEB"|"MAR"|"APR"|"MAY"|"JUN"|"JUL"|"AUG"|"SEP"|"OCT"|"NOV"|"DEC")
DAY_OF_WEEK=[0-7]|("SUN"|"MON"|"TUE"|"WED"|"THU"|"FRI"|"SAT")
CRON_SPECIAL_CHARS=","|"-"
CRON_MINUTE=({MINUTE_IN_HOUR}({CRON_SPECIAL_CHARS}{MINUTE_IN_HOUR})*)|"*"
CRON_HOUR=({HOUR}({CRON_SPECIAL_CHARS}{HOUR})*)|"*"
CRON_DAY=({DAYS_IN_MONTH}({CRON_SPECIAL_CHARS}{DAYS_IN_MONTH})*)|"*"|"?"|"L"|"W"
CRON_MONTH=({MONTHS}({CRON_SPECIAL_CHARS}{MONTHS})*)|"*"
CRON_DOW=({DAY_OF_WEEK}({CRON_SPECIAL_CHARS}{DAY_OF_WEEK})*)|"*"|"?"|"L"|"W"
INT_SECONDS={NUMBER}+"s"
INT_MINUTE={NUMBER}+"m"
INT_HOUR={NUMBER}+"h"
// **************

%%
<YYINITIAL> {
    "package" {return DSLRTypes.PACKAGE;}
    "expander" {return DSLRTypes.EXPANDER;}
    "import" {return DSLRTypes.IMPORT;}
    "global" {return DSLRTypes.GLOBAL;}
    "declare" {
        pushState(DECLARE);
        return DSLRTypes.DECLARE;
    }
    "query" {
        pushState(QUERY);
        return DSLRTypes.QUERY;
    }
    "rule" {
        pushState(RULE_HEADER);
        return DSLRTypes.RULE;
    }
}

<DECLARE> {
    {STRING_TOKEN}{WHITESPACE}*":"{WHITESPACE}*{STRING_TOKEN} {return DSLRTypes.DECLARE_TYPE_METADATA;}
}

<QUERY> {
    {STRING_TOKEN}\ \${STRING_TOKEN} {return DSLRTypes.QUERY_ARG;}
}

<RULE_HEADER> {
    "salience" {return DSLRTypes.SALIENCE;}
    "enabled" {return DSLRTypes.ENABLED;}
    "date-effective" {return DSLRTypes.DATE_EFFECTIVE;}
    "date-expires" {return DSLRTypes.DATE_EXPIRES;}
    "no-loop" {return DSLRTypes.NO_LOOP;}
    "activation-group" {return DSLRTypes.ACTIVATION_GROUP;}
    "duration" {return DSLRTypes.DURATION;}
    "timer" {return DSLRTypes.TIMER;}
    "calendar" {return DSLRTypes.CALENDAR;}
    "auto-focus" {return DSLRTypes.AUTO_FOCUS;}
    "lock-on-active" {return DSLRTypes.LOCK_ON_ACTIVE;}
    "dialect" {return DSLRTypes.DIALECT;}
    "cron" {return DSLRTypes.CRON;}
    {CRON_MINUTE}\ {CRON_HOUR}\ {CRON_DAY}\ {CRON_MONTH}\ {CRON_DOW} {return DSLRTypes.CRON_EXPR;}
    "int" {return DSLRTypes.INT;}
    {INT_HOUR}|{INT_MINUTE}|{INT_SECONDS}/\ ? {return DSLRTypes.INT_TIMER_EXPR;}
    \"{NUMBER}{1,2}\-{MONTH}\-{NUMBER}{4}\" {return DSLRTypes.DATE;}
    "(" | "("/("cron"|"int"|{WHITESPACE}+) {return DSLRTypes.L_PAREN;}
    ")" {return DSLRTypes.R_PAREN;}
    "-" {return DSLRTypes.HYPHEN;}
    "true" {return DSLRTypes.TRUE;}
    "false" {return DSLRTypes.FALSE;}
    {NUMBER}+ {return DSLRTypes.NUMBER;}
    "when" {
        pushState(RULE_LHS);
        return DSLRTypes.WHEN;
    }
    \"{STRING_TOKEN}\" {return DSLRTypes.STRING_LITERAL;}
}

<RULE_LHS> {
    "then" {
        pushState(RULE_RHS);
        return DSLRTypes.THEN;
    }
    {STRING_TOKEN} {return DSLRTypes.STRING_TOKEN;}
    {CRLF} {return DSLRTypes.CRLF;}
}

<RULE_RHS, DECLARE, QUERY> {
    "end" {
        pushState(YYINITIAL);
        return DSLRTypes.END;
    }
}

{WHITESPACE}+ {return TokenType.WHITE_SPACE;}
"("|"("/.* {return DSLRTypes.L_PAREN;}
")" {return DSLRTypes.R_PAREN;}
";" {return DSLRTypes.SEMICOLON;}
":" {return DSLRTypes.COLON;}
"=" {return DSLRTypes.EQ;}
"$" {return DSLRTypes.DOLLAR;}
{STRING_TOKEN} {return DSLRTypes.STRING_TOKEN;}
{SLASH_COMMENT} | {HASH_COMMENT} {
    yybegin(YYINITIAL);
    return DSLRTypes.COMMENT;
}
{DEBUG_COMMENT} {return DSLRTypes.DEBUG;}
{CRLF} {return DSLRTypes.CRLF;}

[^] {
    if (stateStack.isEmpty())
        return TokenType.BAD_CHARACTER;
    popState();
    yypushback(yylength());
}