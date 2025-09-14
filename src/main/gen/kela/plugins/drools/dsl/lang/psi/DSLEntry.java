// This is a generated file. Not intended for manual editing.
package kela.plugins.drools.dsl.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DSLEntry extends PsiElement {

  @Nullable
  DSLComment getComment();

  @Nullable
  DSLDebugComment getDebugComment();

  @Nullable
  DSLKeywordExpression getKeywordExpression();

  @Nullable
  DSLThenExpression getThenExpression();

  @Nullable
  DSLWhenExpression getWhenExpression();

}
