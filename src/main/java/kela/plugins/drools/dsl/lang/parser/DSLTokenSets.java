package kela.plugins.drools.dsl.lang.parser;

import com.intellij.psi.tree.TokenSet;
import kela.plugins.drools.dsl.psi.DSLTypes;

public interface DSLTokenSets {
    TokenSet IDENTIFIERS = TokenSet.create(DSLTypes.WHEN_EXPRESSION,
            DSLTypes.THEN_EXPRESSION,
            DSLTypes.KEYWORD_EXPRESSION,
            DSLTypes.STRING_TOKEN,
            DSLTypes.LHS_VARIABLE);

    TokenSet COMMENTS = TokenSet.create(DSLTypes.COMMENT);
}