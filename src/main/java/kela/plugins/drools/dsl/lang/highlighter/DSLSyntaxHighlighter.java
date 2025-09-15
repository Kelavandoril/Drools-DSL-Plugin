package kela.plugins.drools.dsl.lang.highlighter;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import kela.plugins.drools.dsl.lang.lexer.DSLLexerAdapter;
import kela.plugins.drools.dsl.psi.DSLTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class DSLSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey WHEN =
            createTextAttributesKey("DSL_WHEN", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey THEN =
            createTextAttributesKey("DSL_THEN", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("DSL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VAR =
            createTextAttributesKey("DSL_VAR", DefaultLanguageHighlighterColors.INSTANCE_FIELD);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("DSL_COMMENT", DefaultLanguageHighlighterColors.DOC_COMMENT);

    public static final TextAttributesKey BAD_CHAR =
            createTextAttributesKey("BAD_CHAR", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{WHEN,THEN,KEYWORD};
    private static final TextAttributesKey[] VAR_KEYS = new TextAttributesKey[]{VAR};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] BAD_CHARS = new TextAttributesKey[]{BAD_CHAR};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new DSLLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(DSLTypes.WHEN) || tokenType.equals(DSLTypes.THEN) || tokenType.equals(DSLTypes.KEYWORD)) {
            return KEYWORD_KEYS;
        }
        if (tokenType.equals(DSLTypes.COMMENT)) {
            return COMMENT_KEYS;
        }
        if (tokenType.equals(DSLTypes.VARIABLE)) {
            return VAR_KEYS;
        }
        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHARS;
        }
        return EMPTY_KEYS;
    }
}