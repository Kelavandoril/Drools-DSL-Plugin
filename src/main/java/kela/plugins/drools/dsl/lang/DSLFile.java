package kela.plugins.drools.dsl.lang;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class DSLFile extends PsiFileBase {
    public DSLFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, DSL.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return DSLFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "DSL File";
    }
}