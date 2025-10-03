package kela.plugins.drools.dslr.lang.psi;

import com.intellij.psi.tree.IElementType;
import kela.plugins.drools.dslr.lang.DSLR;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class DSLRTokenType extends IElementType {
    public DSLRTokenType(@NotNull @NonNls String debugName) {
        super(debugName, DSLR.INSTANCE);
    }

    @Override
    public String toString() {
        return "DSLRTokenType." + super.toString();
    }
}