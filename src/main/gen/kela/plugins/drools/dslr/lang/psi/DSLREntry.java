// This is a generated file. Not intended for manual editing.
package kela.plugins.drools.dslr.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DSLREntry extends PsiElement {

  @Nullable
  DSLRComment getComment();

  @Nullable
  DSLRDeclareStatement getDeclareStatement();

  @Nullable
  DSLRExpanderStatement getExpanderStatement();

  @Nullable
  DSLRGlobalStatement getGlobalStatement();

  @Nullable
  DSLRImportStatement getImportStatement();

  @Nullable
  DSLRPackageStatement getPackageStatement();

  @Nullable
  DSLRQueryStatement getQueryStatement();

  @Nullable
  DSLRRuleExpression getRuleExpression();

}
