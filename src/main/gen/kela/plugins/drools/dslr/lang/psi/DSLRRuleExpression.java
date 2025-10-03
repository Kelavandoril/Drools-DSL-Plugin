// This is a generated file. Not intended for manual editing.
package kela.plugins.drools.dslr.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DSLRRuleExpression extends PsiElement {

  @NotNull
  DSLRLhs getLhs();

  @NotNull
  DSLRRhs getRhs();

  @NotNull
  List<DSLRRuleAttributes> getRuleAttributesList();

  @NotNull
  DSLRRuleName getRuleName();

}
