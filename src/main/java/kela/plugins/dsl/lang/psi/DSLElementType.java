package kela.plugins.dsl.lang.psi;

import com.intellij.psi.tree.IElementType;
import kela.plugins.dsl.lang.DSL;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class DSLElementType extends IElementType {
    public DSLElementType(@NotNull @NonNls String debugName) {
        super(debugName, DSL.INSTANCE);
    }
}
