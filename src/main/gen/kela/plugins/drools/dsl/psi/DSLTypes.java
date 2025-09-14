// This is a generated file. Not intended for manual editing.
package kela.plugins.drools.dsl.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import kela.plugins.drools.dsl.lang.psi.DSLElementType;
import kela.plugins.drools.dsl.lang.psi.DSLTokenType;
import kela.plugins.drools.dsl.lang.psi.impl.*;

public interface DSLTypes {

  IElementType COMMENT = new DSLElementType("COMMENT");
  IElementType DEBUG_COMMENT = new DSLElementType("DEBUG_COMMENT");
  IElementType ENTRY = new DSLElementType("ENTRY");
  IElementType JAVA_CODE = new DSLElementType("JAVA_CODE");
  IElementType KEYWORD_EXPRESSION = new DSLElementType("KEYWORD_EXPRESSION");
  IElementType LHS_VARIABLE = new DSLElementType("LHS_VARIABLE");
  IElementType RHS_VARIABLE = new DSLElementType("RHS_VARIABLE");
  IElementType THEN_EXPRESSION = new DSLElementType("THEN_EXPRESSION");
  IElementType WHEN_EXPRESSION = new DSLElementType("WHEN_EXPRESSION");

  IElementType CRLF = new DSLTokenType("CRLF");
  IElementType DEBUG = new DSLTokenType("#/");
  IElementType EQ = new DSLTokenType("=");
  IElementType HASH = new DSLTokenType("#");
  IElementType JAVA = new DSLTokenType("JAVA");
  IElementType KEYWORD = new DSLTokenType("[keyword]");
  IElementType SLASH = new DSLTokenType("//");
  IElementType STRING_TOKEN = new DSLTokenType("STRING_TOKEN");
  IElementType THEN = new DSLTokenType("[then]");
  IElementType VARIABLE = new DSLTokenType("VARIABLE");
  IElementType WHEN = new DSLTokenType("[when]");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == COMMENT) {
        return new DSLCommentImpl(node);
      }
      else if (type == DEBUG_COMMENT) {
        return new DSLDebugCommentImpl(node);
      }
      else if (type == ENTRY) {
        return new DSLEntryImpl(node);
      }
      else if (type == JAVA_CODE) {
        return new DSLJavaCodeImpl(node);
      }
      else if (type == KEYWORD_EXPRESSION) {
        return new DSLKeywordExpressionImpl(node);
      }
      else if (type == LHS_VARIABLE) {
        return new DSLLhsVariableImpl(node);
      }
      else if (type == RHS_VARIABLE) {
        return new DSLRhsVariableImpl(node);
      }
      else if (type == THEN_EXPRESSION) {
        return new DSLThenExpressionImpl(node);
      }
      else if (type == WHEN_EXPRESSION) {
        return new DSLWhenExpressionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
