package kela.plugins.dslr.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import kela.plugins.Icon;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class DSLRFileType extends LanguageFileType {

    public static final DSLRFileType INSTANCE = new DSLRFileType();

    private DSLRFileType() {
        super(DSLR.INSTANCE);
    }

    @Override
    public @NonNls
    @NotNull String getName() {
        return "dslr";
    }

    @Override
    public @NlsContexts.Label
    @NotNull String getDescription() {
        return "IDE support for drools DSLR files";
    }

    @Override
    public @NlsSafe
    @NotNull String getDefaultExtension() {
        return ".dslr";
    }

    @Override
    public javax.swing.Icon getIcon() {
        return Icon.FILE;
    }
}
