package kela.plugins.drools.dslr.lang.parser;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import kela.plugins.drools.dsl.psi.DSLTypes;
import kela.plugins.drools.dslr.lang.psi.DSLRElementType;
import kela.plugins.drools.dslr.psi.DSLRTypes;

public interface DSLRTokenSets {
    TokenSet IDENTIFIERS = TokenSet.create(DSLRTypes.STRING_TOKEN,
            DSLRTypes.EXPANDER_STATEMENT,
            DSLRTypes.PACKAGE_STATEMENT);

    TokenSet COMMENT = TokenSet.create(DSLRTypes.COMMENT);
}