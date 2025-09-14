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

public class DSLThenExpressionImpl extends ASTWrapperPsiElement implements DSLThenExpression {

  public DSLThenExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DSLVisitor visitor) {
    visitor.visitThenExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DSLVisitor) accept((DSLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DSLJavaCode> getJavaCodeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DSLJavaCode.class);
  }

  @Override
  @NotNull
  public List<DSLLhsVariable> getLhsVariableList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DSLLhsVariable.class);
  }

  @Override
  @NotNull
  public List<DSLRhsVariable> getRhsVariableList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DSLRhsVariable.class);
  }

}
