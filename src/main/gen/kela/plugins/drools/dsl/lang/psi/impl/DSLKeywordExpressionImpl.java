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

public class DSLKeywordExpressionImpl extends ASTWrapperPsiElement implements DSLKeywordExpression {

  public DSLKeywordExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DSLVisitor visitor) {
    visitor.visitKeywordExpression(this);
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

}
