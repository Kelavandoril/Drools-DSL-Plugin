// This is a generated file. Not intended for manual editing.
package kela.plugins.drools.dsl.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static kela.plugins.drools.dsl.psi.DSLTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import kela.plugins.drools.dsl.lang.psi.*;

public class DSLEntryImpl extends ASTWrapperPsiElement implements DSLEntry {

  public DSLEntryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DSLVisitor visitor) {
    visitor.visitEntry(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DSLVisitor) accept((DSLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DSLComment getComment() {
    return findChildByClass(DSLComment.class);
  }

  @Override
  @Nullable
  public DSLDebugComment getDebugComment() {
    return findChildByClass(DSLDebugComment.class);
  }

  @Override
  @Nullable
  public DSLKeywordExpression getKeywordExpression() {
    return findChildByClass(DSLKeywordExpression.class);
  }

  @Override
  @Nullable
  public DSLThenExpression getThenExpression() {
    return findChildByClass(DSLThenExpression.class);
  }

  @Override
  @Nullable
  public DSLWhenExpression getWhenExpression() {
    return findChildByClass(DSLWhenExpression.class);
  }

}
