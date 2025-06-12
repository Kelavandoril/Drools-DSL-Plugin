package kela.plugins.dsl.lang;

import com.intellij.lexer.FlexAdapter;
import kela.plugins.dsl.lang.DSLLexer;

public class DSLLexerAdapter extends FlexAdapter {
    public DSLLexerAdapter() {
        super(new DSLLexer(null));
    }
}
