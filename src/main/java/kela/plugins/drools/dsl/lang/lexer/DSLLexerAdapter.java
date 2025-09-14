package kela.plugins.drools.dsl.lang.lexer;

import com.intellij.lexer.FlexAdapter;

public class DSLLexerAdapter extends FlexAdapter {
    public DSLLexerAdapter() {
        super(new DSLLexer(null));
    }
}