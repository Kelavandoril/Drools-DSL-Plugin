package kela.plugins.drools.dslr.lang.highlighter;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import kela.plugins.drools.dslr.lang.lexer.DSLRLexerAdapter;
import kela.plugins.drools.dslr.psi.DSLRTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class DSLRSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey PACKAGE =
            createTextAttributesKey("DSLR_PACKAGE", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey IMPORT =
            createTextAttributesKey("DSLR_IMPORT", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey QUERY =
            createTextAttributesKey("DSLR_QUERY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey DECLARE =
            createTextAttributesKey("DSLR_DECLARE", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey RULE =
            createTextAttributesKey("DSLR_RULE", DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey SALIENCE =
            createTextAttributesKey("DSLR_SALIENCE", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey ENABLED =
            createTextAttributesKey("DSLR_ENABLED", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey DATE_EFFECTIVE =
            createTextAttributesKey("DSLR_DATE_EFFECTIVE", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey DATE_EXPIRES =
            createTextAttributesKey("DSLR_DATE_EXPIRES", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey NO_LOOP =
            createTextAttributesKey("DSLR_NO_LOOP", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey ACTIVATION_GROUP =
            createTextAttributesKey("DSLR_ACTIVATION_GROUP", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey DURATION =
            createTextAttributesKey("DSLR_DURATION", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey TIMER =
            createTextAttributesKey("DSLR_TIMER", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey CALENDAR =
            createTextAttributesKey("DSLR_CALENDAR", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey AUTO_FOCUS =
            createTextAttributesKey("DSLR_AUTO_FOCUS", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey LOCK_ON_ACTIVE =
            createTextAttributesKey("DSLR_LOCK_ON_ACTIVE", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey EXPANDER =
            createTextAttributesKey("DSLR_EXPANDER", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey GLOBAL =
            createTextAttributesKey("DSLR_GLOBAL", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey WHEN =
            createTextAttributesKey("DSLR_WHEN", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey THEN =
            createTextAttributesKey("DSLR_THEN", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey END =
            createTextAttributesKey("DSLR_END", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING_LITERAL =
            createTextAttributesKey("STRING_LITERAL", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey BOOLEAN =
            createTextAttributesKey("BOOLEAN", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("NUMBER", DefaultLanguageHighlighterColors.NUMBER);

    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("DSLR_COMMENT", DefaultLanguageHighlighterColors.DOC_COMMENT);

    public static final TextAttributesKey BAD_CHAR =
            createTextAttributesKey("BAD_CHAR", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{PACKAGE,
            BOOLEAN,
            IMPORT,
            QUERY,
            DECLARE,
            EXPANDER,
            GLOBAL,
            RULE,
            SALIENCE,
            ENABLED,
            DATE_EFFECTIVE,
            DATE_EXPIRES,
            NO_LOOP,
            ACTIVATION_GROUP,
            DURATION,
            TIMER,
            CALENDAR,
            AUTO_FOCUS,
            LOCK_ON_ACTIVE,
            WHEN,
            THEN,
            END};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING_LITERAL};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] BAD_CHARS = new TextAttributesKey[]{BAD_CHAR};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new DSLRLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(DSLRTypes.TRUE) ||
                tokenType.equals(DSLRTypes.FALSE) ||
                tokenType.equals(DSLRTypes.PACKAGE) ||
                tokenType.equals(DSLRTypes.IMPORT) ||
                tokenType.equals(DSLRTypes.QUERY) ||
                tokenType.equals(DSLRTypes.DECLARE) ||
                tokenType.equals(DSLRTypes.EXPANDER) ||
                tokenType.equals(DSLRTypes.GLOBAL) ||
                tokenType.equals(DSLRTypes.RULE) ||
                tokenType.equals(DSLRTypes.SALIENCE) ||
                tokenType.equals(DSLRTypes.ENABLED) ||
                tokenType.equals(DSLRTypes.DATE_EFFECTIVE) ||
                tokenType.equals(DSLRTypes.DATE_EXPIRES) ||
                tokenType.equals(DSLRTypes.NO_LOOP) ||
                tokenType.equals(DSLRTypes.ACTIVATION_GROUP) ||
                tokenType.equals(DSLRTypes.DURATION) ||
                tokenType.equals(DSLRTypes.TIMER) ||
                tokenType.equals(DSLRTypes.CALENDAR) ||
                tokenType.equals(DSLRTypes.AUTO_FOCUS) ||
                tokenType.equals(DSLRTypes.LOCK_ON_ACTIVE) ||
                tokenType.equals(DSLRTypes.DIALECT) ||
                tokenType.equals(DSLRTypes.WHEN) ||
                tokenType.equals(DSLRTypes.THEN) ||
                tokenType.equals(DSLRTypes.END)) {
            return KEYWORD_KEYS;
        }
        if (tokenType.equals(DSLRTypes.NUMBER)) {
            return NUMBER_KEYS;
        }
        if (tokenType.equals(DSLRTypes.STRING_LITERAL) ||
                tokenType.equals(DSLRTypes.DATE)) {
            return STRING_KEYS;
        }
        if (tokenType.equals(DSLRTypes.COMMENT)) {
            return COMMENT_KEYS;
        }
        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHARS;
        }
        return EMPTY_KEYS;
    }
}