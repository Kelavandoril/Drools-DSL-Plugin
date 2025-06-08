package kela.plugins.dsl.lang;

import com.intellij.lang.Language;

public class DSL extends Language {

    public static final DSL INSTANCE = new DSL();
    private DSL() {
        super("dsl");
    }
}
