// This is a generated file. Not intended for manual editing.
package kela.plugins.drools.dslr.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import kela.plugins.drools.dslr.lang.psi.DSLRElementType;
import kela.plugins.drools.dslr.lang.psi.DSLRTokenType;
import kela.plugins.drools.dslr.lang.psi.impl.*;

public interface DSLRTypes {

  IElementType ACTIVATION_GROUP_ATTR = new DSLRElementType("ACTIVATION_GROUP_ATTR");
  IElementType ACTIVATION_GROUP_NAME = new DSLRElementType("ACTIVATION_GROUP_NAME");
  IElementType AUTO_FOCUS_ATTR = new DSLRElementType("AUTO_FOCUS_ATTR");
  IElementType BOOLEAN = new DSLRElementType("BOOLEAN");
  IElementType CALENDAR_ATTR = new DSLRElementType("CALENDAR_ATTR");
  IElementType CALENDAR_EXPR = new DSLRElementType("CALENDAR_EXPR");
  IElementType COMMENT = new DSLRElementType("COMMENT");
  IElementType CRON_TIMER = new DSLRElementType("CRON_TIMER");
  IElementType DATE_EFFECTIVE_ATTR = new DSLRElementType("DATE_EFFECTIVE_ATTR");
  IElementType DATE_EXPIRES_ATTR = new DSLRElementType("DATE_EXPIRES_ATTR");
  IElementType DECLARE_METADATA = new DSLRElementType("DECLARE_METADATA");
  IElementType DECLARE_STATEMENT = new DSLRElementType("DECLARE_STATEMENT");
  IElementType DECLARE_TYPE_NAME = new DSLRElementType("DECLARE_TYPE_NAME");
  IElementType DIALECT_ATTR = new DSLRElementType("DIALECT_ATTR");
  IElementType DIALECT_NAME = new DSLRElementType("DIALECT_NAME");
  IElementType DURATION_ATTR = new DSLRElementType("DURATION_ATTR");
  IElementType ENABLED_ATTR = new DSLRElementType("ENABLED_ATTR");
  IElementType ENTRY = new DSLRElementType("ENTRY");
  IElementType EXPANDER_NAME = new DSLRElementType("EXPANDER_NAME");
  IElementType EXPANDER_STATEMENT = new DSLRElementType("EXPANDER_STATEMENT");
  IElementType GLOBAL_NAME = new DSLRElementType("GLOBAL_NAME");
  IElementType GLOBAL_STATEMENT = new DSLRElementType("GLOBAL_STATEMENT");
  IElementType GLOBAL_TYPE = new DSLRElementType("GLOBAL_TYPE");
  IElementType IMPORT_NAME = new DSLRElementType("IMPORT_NAME");
  IElementType IMPORT_STATEMENT = new DSLRElementType("IMPORT_STATEMENT");
  IElementType INT_TIMER = new DSLRElementType("INT_TIMER");
  IElementType LHS = new DSLRElementType("LHS");
  IElementType LOCK_ON_ATTR = new DSLRElementType("LOCK_ON_ATTR");
  IElementType NO_LOOP_ATTR = new DSLRElementType("NO_LOOP_ATTR");
  IElementType PACKAGE_NAME = new DSLRElementType("PACKAGE_NAME");
  IElementType PACKAGE_STATEMENT = new DSLRElementType("PACKAGE_STATEMENT");
  IElementType QUERY_LHS = new DSLRElementType("QUERY_LHS");
  IElementType QUERY_NAME = new DSLRElementType("QUERY_NAME");
  IElementType QUERY_STATEMENT = new DSLRElementType("QUERY_STATEMENT");
  IElementType RHS = new DSLRElementType("RHS");
  IElementType RULE_ATTRIBUTES = new DSLRElementType("RULE_ATTRIBUTES");
  IElementType RULE_EXPRESSION = new DSLRElementType("RULE_EXPRESSION");
  IElementType RULE_NAME = new DSLRElementType("RULE_NAME");
  IElementType SALIENCE_ATTR = new DSLRElementType("SALIENCE_ATTR");
  IElementType TIMER_ATTR = new DSLRElementType("TIMER_ATTR");
  IElementType TIMER_DELAY = new DSLRElementType("TIMER_DELAY");
  IElementType TIMER_INTERVAL = new DSLRElementType("TIMER_INTERVAL");

  IElementType ACTIVATION_GROUP = new DSLRTokenType("activation-group");
  IElementType AUTO_FOCUS = new DSLRTokenType("auto-focus");
  IElementType CALENDAR = new DSLRTokenType("calendar");
  IElementType COLON = new DSLRTokenType(":");
  IElementType CRLF = new DSLRTokenType("CRLF");
  IElementType CRON = new DSLRTokenType("cron");
  IElementType CRON_EXPR = new DSLRTokenType("CRON_EXPR");
  IElementType DATE = new DSLRTokenType("DATE");
  IElementType DATE_EFFECTIVE = new DSLRTokenType("date-effective");
  IElementType DATE_EXPIRES = new DSLRTokenType("date-expires");
  IElementType DEBUG = new DSLRTokenType("#/");
  IElementType DECLARE = new DSLRTokenType("declare");
  IElementType DECLARE_TYPE_METADATA = new DSLRTokenType("DECLARE_TYPE_METADATA");
  IElementType DIALECT = new DSLRTokenType("dialect");
  IElementType DOLLAR = new DSLRTokenType("$");
  IElementType DURATION = new DSLRTokenType("duration");
  IElementType ENABLED = new DSLRTokenType("enabled");
  IElementType END = new DSLRTokenType("end");
  IElementType EQ = new DSLRTokenType("=");
  IElementType EXPANDER = new DSLRTokenType("expander");
  IElementType FALSE = new DSLRTokenType("false");
  IElementType GLOBAL = new DSLRTokenType("global");
  IElementType HASH = new DSLRTokenType("#");
  IElementType HYPHEN = new DSLRTokenType("-");
  IElementType IMPORT = new DSLRTokenType("import");
  IElementType INT = new DSLRTokenType("int");
  IElementType INT_TIMER_EXPR = new DSLRTokenType("INT_TIMER_EXPR");
  IElementType LOCK_ON_ACTIVE = new DSLRTokenType("lock-on-active");
  IElementType L_PAREN = new DSLRTokenType("(");
  IElementType NO_LOOP = new DSLRTokenType("no-loop");
  IElementType NUMBER = new DSLRTokenType("NUMBER");
  IElementType PACKAGE = new DSLRTokenType("package");
  IElementType QUERY = new DSLRTokenType("query");
  IElementType QUERY_ARG = new DSLRTokenType("QUERY_ARG");
  IElementType RULE = new DSLRTokenType("rule");
  IElementType R_PAREN = new DSLRTokenType(")");
  IElementType SALIENCE = new DSLRTokenType("salience");
  IElementType SEMICOLON = new DSLRTokenType(";");
  IElementType SLASH = new DSLRTokenType("//");
  IElementType STRING_LITERAL = new DSLRTokenType("STRING_LITERAL");
  IElementType STRING_TOKEN = new DSLRTokenType("STRING_TOKEN");
  IElementType THEN = new DSLRTokenType("then");
  IElementType TIMER = new DSLRTokenType("timer");
  IElementType TRUE = new DSLRTokenType("true");
  IElementType WHEN = new DSLRTokenType("when");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ACTIVATION_GROUP_ATTR) {
        return new DSLRActivationGroupAttrImpl(node);
      }
      else if (type == ACTIVATION_GROUP_NAME) {
        return new DSLRActivationGroupNameImpl(node);
      }
      else if (type == AUTO_FOCUS_ATTR) {
        return new DSLRAutoFocusAttrImpl(node);
      }
      else if (type == BOOLEAN) {
        return new DSLRBooleanImpl(node);
      }
      else if (type == CALENDAR_ATTR) {
        return new DSLRCalendarAttrImpl(node);
      }
      else if (type == CALENDAR_EXPR) {
        return new DSLRCalendarExprImpl(node);
      }
      else if (type == COMMENT) {
        return new DSLRCommentImpl(node);
      }
      else if (type == CRON_TIMER) {
        return new DSLRCronTimerImpl(node);
      }
      else if (type == DATE_EFFECTIVE_ATTR) {
        return new DSLRDateEffectiveAttrImpl(node);
      }
      else if (type == DATE_EXPIRES_ATTR) {
        return new DSLRDateExpiresAttrImpl(node);
      }
      else if (type == DECLARE_METADATA) {
        return new DSLRDeclareMetadataImpl(node);
      }
      else if (type == DECLARE_STATEMENT) {
        return new DSLRDeclareStatementImpl(node);
      }
      else if (type == DECLARE_TYPE_NAME) {
        return new DSLRDeclareTypeNameImpl(node);
      }
      else if (type == DIALECT_ATTR) {
        return new DSLRDialectAttrImpl(node);
      }
      else if (type == DIALECT_NAME) {
        return new DSLRDialectNameImpl(node);
      }
      else if (type == DURATION_ATTR) {
        return new DSLRDurationAttrImpl(node);
      }
      else if (type == ENABLED_ATTR) {
        return new DSLREnabledAttrImpl(node);
      }
      else if (type == ENTRY) {
        return new DSLREntryImpl(node);
      }
      else if (type == EXPANDER_NAME) {
        return new DSLRExpanderNameImpl(node);
      }
      else if (type == EXPANDER_STATEMENT) {
        return new DSLRExpanderStatementImpl(node);
      }
      else if (type == GLOBAL_NAME) {
        return new DSLRGlobalNameImpl(node);
      }
      else if (type == GLOBAL_STATEMENT) {
        return new DSLRGlobalStatementImpl(node);
      }
      else if (type == GLOBAL_TYPE) {
        return new DSLRGlobalTypeImpl(node);
      }
      else if (type == IMPORT_NAME) {
        return new DSLRImportNameImpl(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new DSLRImportStatementImpl(node);
      }
      else if (type == INT_TIMER) {
        return new DSLRIntTimerImpl(node);
      }
      else if (type == LHS) {
        return new DSLRLhsImpl(node);
      }
      else if (type == LOCK_ON_ATTR) {
        return new DSLRLockOnAttrImpl(node);
      }
      else if (type == NO_LOOP_ATTR) {
        return new DSLRNoLoopAttrImpl(node);
      }
      else if (type == PACKAGE_NAME) {
        return new DSLRPackageNameImpl(node);
      }
      else if (type == PACKAGE_STATEMENT) {
        return new DSLRPackageStatementImpl(node);
      }
      else if (type == QUERY_LHS) {
        return new DSLRQueryLhsImpl(node);
      }
      else if (type == QUERY_NAME) {
        return new DSLRQueryNameImpl(node);
      }
      else if (type == QUERY_STATEMENT) {
        return new DSLRQueryStatementImpl(node);
      }
      else if (type == RHS) {
        return new DSLRRhsImpl(node);
      }
      else if (type == RULE_ATTRIBUTES) {
        return new DSLRRuleAttributesImpl(node);
      }
      else if (type == RULE_EXPRESSION) {
        return new DSLRRuleExpressionImpl(node);
      }
      else if (type == RULE_NAME) {
        return new DSLRRuleNameImpl(node);
      }
      else if (type == SALIENCE_ATTR) {
        return new DSLRSalienceAttrImpl(node);
      }
      else if (type == TIMER_ATTR) {
        return new DSLRTimerAttrImpl(node);
      }
      else if (type == TIMER_DELAY) {
        return new DSLRTimerDelayImpl(node);
      }
      else if (type == TIMER_INTERVAL) {
        return new DSLRTimerIntervalImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
