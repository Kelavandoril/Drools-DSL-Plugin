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

public class DSLRRuleAttributesImpl extends ASTWrapperPsiElement implements DSLRRuleAttributes {

  public DSLRRuleAttributesImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DSLRVisitor visitor) {
    visitor.visitRuleAttributes(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DSLRVisitor) accept((DSLRVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DSLRActivationGroupAttr getActivationGroupAttr() {
    return findChildByClass(DSLRActivationGroupAttr.class);
  }

  @Override
  @Nullable
  public DSLRAutoFocusAttr getAutoFocusAttr() {
    return findChildByClass(DSLRAutoFocusAttr.class);
  }

  @Override
  @Nullable
  public DSLRCalendarAttr getCalendarAttr() {
    return findChildByClass(DSLRCalendarAttr.class);
  }

  @Override
  @Nullable
  public DSLRComment getComment() {
    return findChildByClass(DSLRComment.class);
  }

  @Override
  @Nullable
  public DSLRDateEffectiveAttr getDateEffectiveAttr() {
    return findChildByClass(DSLRDateEffectiveAttr.class);
  }

  @Override
  @Nullable
  public DSLRDateExpiresAttr getDateExpiresAttr() {
    return findChildByClass(DSLRDateExpiresAttr.class);
  }

  @Override
  @Nullable
  public DSLRDialectAttr getDialectAttr() {
    return findChildByClass(DSLRDialectAttr.class);
  }

  @Override
  @Nullable
  public DSLRDurationAttr getDurationAttr() {
    return findChildByClass(DSLRDurationAttr.class);
  }

  @Override
  @Nullable
  public DSLREnabledAttr getEnabledAttr() {
    return findChildByClass(DSLREnabledAttr.class);
  }

  @Override
  @Nullable
  public DSLRLockOnAttr getLockOnAttr() {
    return findChildByClass(DSLRLockOnAttr.class);
  }

  @Override
  @Nullable
  public DSLRNoLoopAttr getNoLoopAttr() {
    return findChildByClass(DSLRNoLoopAttr.class);
  }

  @Override
  @Nullable
  public DSLRSalienceAttr getSalienceAttr() {
    return findChildByClass(DSLRSalienceAttr.class);
  }

  @Override
  @Nullable
  public DSLRTimerAttr getTimerAttr() {
    return findChildByClass(DSLRTimerAttr.class);
  }

}
