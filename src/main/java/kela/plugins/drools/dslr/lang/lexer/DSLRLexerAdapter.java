package kela.plugins.drools.dslr.lang.lexer;

import com.intellij.lexer.FlexAdapter;

public class DSLRLexerAdapter extends FlexAdapter {
    public DSLRLexerAdapter() {
        super(new DSLRLexer(null));
    }
}