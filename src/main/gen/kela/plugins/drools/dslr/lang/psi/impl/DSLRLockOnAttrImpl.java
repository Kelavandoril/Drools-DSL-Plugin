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

public class DSLRLockOnAttrImpl extends ASTWrapperPsiElement implements DSLRLockOnAttr {

  public DSLRLockOnAttrImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DSLRVisitor visitor) {
    visitor.visitLockOnAttr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DSLRVisitor) accept((DSLRVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DSLRBoolean getBoolean() {
    return findNotNullChildByClass(DSLRBoolean.class);
  }

}
