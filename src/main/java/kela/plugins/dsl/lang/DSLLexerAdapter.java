package kela.plugins.dsl.lang;

import com.intellij.lexer.FlexAdapter;

public class DSLLexerAdapter extends FlexAdapter {
    public DSLLexerAdapter() {
        super(new DSLLexer(null));
    }
}
