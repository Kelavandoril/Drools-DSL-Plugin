package kela.plugins.dsl.psi;

import com.intellij.psi.tree.IElementType;
import kela.plugins.dsl.lang.DSL;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class DSLTokenType extends IElementType {
    public DSLTokenType(@NotNull @NonNls String debugName) {
        super(debugName, DSL.INSTANCE);
    }

    @Override
    public String toString() {
        return "DSLTokenType." + super.toString();
    }
}
