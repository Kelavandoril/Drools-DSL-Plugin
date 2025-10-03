// This is a generated file. Not intended for manual editing.
package kela.plugins.drools.dslr.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static kela.plugins.drools.dslr.psi.DSLRTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import kela.plugins.drools.dslr.lang.psi.*;

public class DSLRRuleExpressionImpl extends ASTWrapperPsiElement implements DSLRRuleExpression {

  public DSLRRuleExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DSLRVisitor visitor) {
    visitor.visitRuleExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DSLRVisitor) accept((DSLRVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DSLRLhs getLhs() {
    return findNotNullChildByClass(DSLRLhs.class);
  }

  @Override
  @NotNull
  public DSLRRhs getRhs() {
    return findNotNullChildByClass(DSLRRhs.class);
  }

  @Override
  @NotNull
  public List<DSLRRuleAttributes> getRuleAttributesList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DSLRRuleAttributes.class);
  }

  @Override
  @NotNull
  public DSLRRuleName getRuleName() {
    return findNotNullChildByClass(DSLRRuleName.class);
  }

}
