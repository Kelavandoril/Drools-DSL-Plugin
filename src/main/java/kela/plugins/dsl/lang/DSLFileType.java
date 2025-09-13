package kela.plugins.dsl.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import kela.plugins.FileIcon;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class DSLFileType extends LanguageFileType {

    public static final DSLFileType INSTANCE = new DSLFileType();

    private DSLFileType() {
        super(DSL.INSTANCE);
    }

    @Override
    public @NonNls
    @NotNull String getName() {
        return "dsl";
    }

    @Override
    public @NlsContexts.Label
    @NotNull String getDescription() {
        return "IDE support for drools DSL files";
    }

    @Override
    public @NlsSafe
    @NotNull String getDefaultExtension() {
        return ".dsl";
    }

    @Override
    public Icon getIcon() {
        return FileIcon.FILE;
    }
}
