package kela.plugins.drools.dslr.lang.psi;

import com.intellij.psi.tree.IElementType;
import kela.plugins.drools.dslr.lang.DSLR;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class DSLRElementType extends IElementType {
    public DSLRElementType(@NotNull @NonNls String debugName) {
        super(debugName, DSLR.INSTANCE);
    }
}