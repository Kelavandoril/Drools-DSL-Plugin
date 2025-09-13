package kela.plugins.dslr.lang;

import com.intellij.lang.Language;

public class DSLR extends Language {

    public static final DSLR INSTANCE = new DSLR();
    private DSLR() {
        super("dslr");
    }
}
