package kela.plugins.drools.dslr.lang;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class DSLRFile extends PsiFileBase {
    public DSLRFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, DSLR.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return DSLRFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "DSLR File";
    }
}