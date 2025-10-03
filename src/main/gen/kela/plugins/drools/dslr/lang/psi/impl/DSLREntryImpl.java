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

public class DSLREntryImpl extends ASTWrapperPsiElement implements DSLREntry {

  public DSLREntryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DSLRVisitor visitor) {
    visitor.visitEntry(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DSLRVisitor) accept((DSLRVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DSLRComment getComment() {
    return findChildByClass(DSLRComment.class);
  }

  @Override
  @Nullable
  public DSLRDeclareStatement getDeclareStatement() {
    return findChildByClass(DSLRDeclareStatement.class);
  }

  @Override
  @Nullable
  public DSLRExpanderStatement getExpanderStatement() {
    return findChildByClass(DSLRExpanderStatement.class);
  }

  @Override
  @Nullable
  public DSLRGlobalStatement getGlobalStatement() {
    return findChildByClass(DSLRGlobalStatement.class);
  }

  @Override
  @Nullable
  public DSLRImportStatement getImportStatement() {
    return findChildByClass(DSLRImportStatement.class);
  }

  @Override
  @Nullable
  public DSLRPackageStatement getPackageStatement() {
    return findChildByClass(DSLRPackageStatement.class);
  }

  @Override
  @Nullable
  public DSLRQueryStatement getQueryStatement() {
    return findChildByClass(DSLRQueryStatement.class);
  }

  @Override
  @Nullable
  public DSLRRuleExpression getRuleExpression() {
    return findChildByClass(DSLRRuleExpression.class);
  }

}
