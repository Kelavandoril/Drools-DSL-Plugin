package kela.plugins.dsl.lang;

import com.intellij.psi.tree.TokenSet;
import kela.plugins.dsl.psi.DSLTypes;

public interface DSLTokenSets {
    TokenSet IDENTIFIERS = TokenSet.create(DSLTypes.LHS,
            DSLTypes.LHS_VARIABLE,
            DSLTypes.LVAR,
            DSLTypes.STRING_TOKEN,
            DSLTypes.RHS);

    TokenSet COMMENTS = TokenSet.create(DSLTypes.COMMENT);
}
