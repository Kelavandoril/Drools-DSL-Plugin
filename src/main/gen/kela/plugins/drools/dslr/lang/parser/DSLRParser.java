// This is a generated file. Not intended for manual editing.
package kela.plugins.drools.dslr.lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static kela.plugins.drools.dslr.psi.DSLRTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DSLRParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return dslrFile(b, l + 1);
  }

  /* ********************************************************** */
  // "activation-group" ACTIVATION_GROUP_NAME
  public static boolean ACTIVATION_GROUP_ATTR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ACTIVATION_GROUP_ATTR")) return false;
    if (!nextTokenIs(b, ACTIVATION_GROUP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ACTIVATION_GROUP);
    r = r && ACTIVATION_GROUP_NAME(b, l + 1);
    exit_section_(b, m, ACTIVATION_GROUP_ATTR, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_LITERAL
  public static boolean ACTIVATION_GROUP_NAME(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ACTIVATION_GROUP_NAME")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_LITERAL);
    exit_section_(b, m, ACTIVATION_GROUP_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // "auto-focus" BOOLEAN
  public static boolean AUTO_FOCUS_ATTR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AUTO_FOCUS_ATTR")) return false;
    if (!nextTokenIs(b, AUTO_FOCUS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AUTO_FOCUS);
    r = r && BOOLEAN(b, l + 1);
    exit_section_(b, m, AUTO_FOCUS_ATTR, r);
    return r;
  }

  /* ********************************************************** */
  // "true" | "false"
  public static boolean BOOLEAN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BOOLEAN")) return false;
    if (!nextTokenIs(b, "<boolean>", FALSE, TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN, "<boolean>");
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "calendar" CALENDAR_EXPR
  public static boolean CALENDAR_ATTR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CALENDAR_ATTR")) return false;
    if (!nextTokenIs(b, CALENDAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CALENDAR);
    r = r && CALENDAR_EXPR(b, l + 1);
    exit_section_(b, m, CALENDAR_ATTR, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_LITERAL
  public static boolean CALENDAR_EXPR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CALENDAR_EXPR")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_LITERAL);
    exit_section_(b, m, CALENDAR_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // ("//"|"#") STRING_TOKEN* CRLF?
  public static boolean COMMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMENT")) return false;
    if (!nextTokenIs(b, "<comment>", HASH, SLASH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMENT, "<comment>");
    r = COMMENT_0(b, l + 1);
    r = r && COMMENT_1(b, l + 1);
    r = r && COMMENT_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "//"|"#"
  private static boolean COMMENT_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMENT_0")) return false;
    boolean r;
    r = consumeToken(b, SLASH);
    if (!r) r = consumeToken(b, HASH);
    return r;
  }

  // STRING_TOKEN*
  private static boolean COMMENT_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMENT_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, STRING_TOKEN)) break;
      if (!empty_element_parsed_guard_(b, "COMMENT_1", c)) break;
    }
    return true;
  }

  // CRLF?
  private static boolean COMMENT_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMENT_2")) return false;
    consumeToken(b, CRLF);
    return true;
  }

  /* ********************************************************** */
  // "cron" ":" CRON_EXPR
  public static boolean CRON_TIMER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CRON_TIMER")) return false;
    if (!nextTokenIs(b, CRON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CRON, COLON, CRON_EXPR);
    exit_section_(b, m, CRON_TIMER, r);
    return r;
  }

  /* ********************************************************** */
  // "date-effective" DATE
  public static boolean DATE_EFFECTIVE_ATTR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DATE_EFFECTIVE_ATTR")) return false;
    if (!nextTokenIs(b, DATE_EFFECTIVE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DATE_EFFECTIVE, DATE);
    exit_section_(b, m, DATE_EFFECTIVE_ATTR, r);
    return r;
  }

  /* ********************************************************** */
  // "date-expires" DATE
  public static boolean DATE_EXPIRES_ATTR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DATE_EXPIRES_ATTR")) return false;
    if (!nextTokenIs(b, DATE_EXPIRES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DATE_EXPIRES, DATE);
    exit_section_(b, m, DATE_EXPIRES_ATTR, r);
    return r;
  }

  /* ********************************************************** */
  // CRLF | COMMENT | DECLARE_TYPE_METADATA
  public static boolean DECLARE_METADATA(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DECLARE_METADATA")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARE_METADATA, "<declare metadata>");
    r = consumeToken(b, CRLF);
    if (!r) r = COMMENT(b, l + 1);
    if (!r) r = consumeToken(b, DECLARE_TYPE_METADATA);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "declare" DECLARE_TYPE_NAME (DECLARE_METADATA)* "end"
  public static boolean DECLARE_STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DECLARE_STATEMENT")) return false;
    if (!nextTokenIs(b, DECLARE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECLARE);
    r = r && DECLARE_TYPE_NAME(b, l + 1);
    r = r && DECLARE_STATEMENT_2(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, DECLARE_STATEMENT, r);
    return r;
  }

  // (DECLARE_METADATA)*
  private static boolean DECLARE_STATEMENT_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DECLARE_STATEMENT_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DECLARE_STATEMENT_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DECLARE_STATEMENT_2", c)) break;
    }
    return true;
  }

  // (DECLARE_METADATA)
  private static boolean DECLARE_STATEMENT_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DECLARE_STATEMENT_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DECLARE_METADATA(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_TOKEN
  public static boolean DECLARE_TYPE_NAME(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DECLARE_TYPE_NAME")) return false;
    if (!nextTokenIs(b, STRING_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_TOKEN);
    exit_section_(b, m, DECLARE_TYPE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // "dialect" DIALECT_NAME
  public static boolean DIALECT_ATTR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DIALECT_ATTR")) return false;
    if (!nextTokenIs(b, DIALECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DIALECT);
    r = r && DIALECT_NAME(b, l + 1);
    exit_section_(b, m, DIALECT_ATTR, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_LITERAL
  public static boolean DIALECT_NAME(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DIALECT_NAME")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_LITERAL);
    exit_section_(b, m, DIALECT_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // "duration" NUMBER
  public static boolean DURATION_ATTR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DURATION_ATTR")) return false;
    if (!nextTokenIs(b, DURATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DURATION, NUMBER);
    exit_section_(b, m, DURATION_ATTR, r);
    return r;
  }

  /* ********************************************************** */
  // "enabled" BOOLEAN
  public static boolean ENABLED_ATTR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ENABLED_ATTR")) return false;
    if (!nextTokenIs(b, ENABLED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENABLED);
    r = r && BOOLEAN(b, l + 1);
    exit_section_(b, m, ENABLED_ATTR, r);
    return r;
  }

  /* ********************************************************** */
  // COMMENT |
  //             CRLF |
  //             PACKAGE_STATEMENT |
  //             DECLARE_STATEMENT |
  //             QUERY_STATEMENT |
  //             EXPANDER_STATEMENT |
  //             IMPORT_STATEMENT |
  //             GLOBAL_STATEMENT |
  //             RULE_EXPRESSION
  public static boolean ENTRY(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ENTRY")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTRY, "<entry>");
    r = COMMENT(b, l + 1);
    if (!r) r = consumeToken(b, CRLF);
    if (!r) r = PACKAGE_STATEMENT(b, l + 1);
    if (!r) r = DECLARE_STATEMENT(b, l + 1);
    if (!r) r = QUERY_STATEMENT(b, l + 1);
    if (!r) r = EXPANDER_STATEMENT(b, l + 1);
    if (!r) r = IMPORT_STATEMENT(b, l + 1);
    if (!r) r = GLOBAL_STATEMENT(b, l + 1);
    if (!r) r = RULE_EXPRESSION(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STRING_TOKEN
  public static boolean EXPANDER_NAME(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPANDER_NAME")) return false;
    if (!nextTokenIs(b, STRING_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_TOKEN);
    exit_section_(b, m, EXPANDER_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // "expander" EXPANDER_NAME (";")?
  public static boolean EXPANDER_STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPANDER_STATEMENT")) return false;
    if (!nextTokenIs(b, EXPANDER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXPANDER);
    r = r && EXPANDER_NAME(b, l + 1);
    r = r && EXPANDER_STATEMENT_2(b, l + 1);
    exit_section_(b, m, EXPANDER_STATEMENT, r);
    return r;
  }

  // (";")?
  private static boolean EXPANDER_STATEMENT_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPANDER_STATEMENT_2")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // STRING_TOKEN
  public static boolean GLOBAL_NAME(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GLOBAL_NAME")) return false;
    if (!nextTokenIs(b, STRING_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_TOKEN);
    exit_section_(b, m, GLOBAL_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // "global" GLOBAL_TYPE GLOBAL_NAME (";")?
  public static boolean GLOBAL_STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GLOBAL_STATEMENT")) return false;
    if (!nextTokenIs(b, GLOBAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GLOBAL);
    r = r && GLOBAL_TYPE(b, l + 1);
    r = r && GLOBAL_NAME(b, l + 1);
    r = r && GLOBAL_STATEMENT_3(b, l + 1);
    exit_section_(b, m, GLOBAL_STATEMENT, r);
    return r;
  }

  // (";")?
  private static boolean GLOBAL_STATEMENT_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GLOBAL_STATEMENT_3")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // STRING_TOKEN
  public static boolean GLOBAL_TYPE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GLOBAL_TYPE")) return false;
    if (!nextTokenIs(b, STRING_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_TOKEN);
    exit_section_(b, m, GLOBAL_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_TOKEN
  public static boolean IMPORT_NAME(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IMPORT_NAME")) return false;
    if (!nextTokenIs(b, STRING_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_TOKEN);
    exit_section_(b, m, IMPORT_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // "import" IMPORT_NAME (";")?
  public static boolean IMPORT_STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IMPORT_STATEMENT")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPORT);
    r = r && IMPORT_NAME(b, l + 1);
    r = r && IMPORT_STATEMENT_2(b, l + 1);
    exit_section_(b, m, IMPORT_STATEMENT, r);
    return r;
  }

  // (";")?
  private static boolean IMPORT_STATEMENT_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IMPORT_STATEMENT_2")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // "int" ":" TIMER_DELAY TIMER_INTERVAL
  public static boolean INT_TIMER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INT_TIMER")) return false;
    if (!nextTokenIs(b, INT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INT, COLON);
    r = r && TIMER_DELAY(b, l + 1);
    r = r && TIMER_INTERVAL(b, l + 1);
    exit_section_(b, m, INT_TIMER, r);
    return r;
  }

  /* ********************************************************** */
  // (CRLF | STRING_TOKEN)+
  public static boolean LHS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LHS")) return false;
    if (!nextTokenIs(b, "<lhs>", CRLF, STRING_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LHS, "<lhs>");
    r = LHS_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!LHS_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LHS", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CRLF | STRING_TOKEN
  private static boolean LHS_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LHS_0")) return false;
    boolean r;
    r = consumeToken(b, CRLF);
    if (!r) r = consumeToken(b, STRING_TOKEN);
    return r;
  }

  /* ********************************************************** */
  // "lock-on-active" BOOLEAN
  public static boolean LOCK_ON_ATTR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LOCK_ON_ATTR")) return false;
    if (!nextTokenIs(b, LOCK_ON_ACTIVE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOCK_ON_ACTIVE);
    r = r && BOOLEAN(b, l + 1);
    exit_section_(b, m, LOCK_ON_ATTR, r);
    return r;
  }

  /* ********************************************************** */
  // "no-loop" BOOLEAN
  public static boolean NO_LOOP_ATTR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NO_LOOP_ATTR")) return false;
    if (!nextTokenIs(b, NO_LOOP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NO_LOOP);
    r = r && BOOLEAN(b, l + 1);
    exit_section_(b, m, NO_LOOP_ATTR, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_TOKEN
  public static boolean PACKAGE_NAME(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PACKAGE_NAME")) return false;
    if (!nextTokenIs(b, STRING_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_TOKEN);
    exit_section_(b, m, PACKAGE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // "package" PACKAGE_NAME (";")?
  public static boolean PACKAGE_STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PACKAGE_STATEMENT")) return false;
    if (!nextTokenIs(b, PACKAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PACKAGE);
    r = r && PACKAGE_NAME(b, l + 1);
    r = r && PACKAGE_STATEMENT_2(b, l + 1);
    exit_section_(b, m, PACKAGE_STATEMENT, r);
    return r;
  }

  // (";")?
  private static boolean PACKAGE_STATEMENT_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PACKAGE_STATEMENT_2")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // (CRLF | COMMENT | STRING_TOKEN | ":" | "(" | ")" | "$" | "=" | ";")+
  public static boolean QUERY_LHS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QUERY_LHS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUERY_LHS, "<query lhs>");
    r = QUERY_LHS_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!QUERY_LHS_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "QUERY_LHS", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CRLF | COMMENT | STRING_TOKEN | ":" | "(" | ")" | "$" | "=" | ";"
  private static boolean QUERY_LHS_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QUERY_LHS_0")) return false;
    boolean r;
    r = consumeToken(b, CRLF);
    if (!r) r = COMMENT(b, l + 1);
    if (!r) r = consumeToken(b, STRING_TOKEN);
    if (!r) r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, L_PAREN);
    if (!r) r = consumeToken(b, R_PAREN);
    if (!r) r = consumeToken(b, DOLLAR);
    if (!r) r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // STRING_TOKEN
  public static boolean QUERY_NAME(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QUERY_NAME")) return false;
    if (!nextTokenIs(b, STRING_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_TOKEN);
    exit_section_(b, m, QUERY_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // "query" QUERY_NAME "(" (QUERY_ARG)* ")" QUERY_LHS "end"
  public static boolean QUERY_STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QUERY_STATEMENT")) return false;
    if (!nextTokenIs(b, QUERY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUERY);
    r = r && QUERY_NAME(b, l + 1);
    r = r && consumeToken(b, L_PAREN);
    r = r && QUERY_STATEMENT_3(b, l + 1);
    r = r && consumeToken(b, R_PAREN);
    r = r && QUERY_LHS(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, QUERY_STATEMENT, r);
    return r;
  }

  // (QUERY_ARG)*
  private static boolean QUERY_STATEMENT_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QUERY_STATEMENT_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, QUERY_ARG)) break;
      if (!empty_element_parsed_guard_(b, "QUERY_STATEMENT_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (CRLF | STRING_TOKEN)+
  public static boolean RHS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RHS")) return false;
    if (!nextTokenIs(b, "<rhs>", CRLF, STRING_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RHS, "<rhs>");
    r = RHS_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!RHS_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RHS", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CRLF | STRING_TOKEN
  private static boolean RHS_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RHS_0")) return false;
    boolean r;
    r = consumeToken(b, CRLF);
    if (!r) r = consumeToken(b, STRING_TOKEN);
    return r;
  }

  /* ********************************************************** */
  // COMMENT |
  //                     CRLF |
  //                     SALIENCE_ATTR |
  //                     ENABLED_ATTR |
  //                     DATE_EFFECTIVE_ATTR |
  //                     DATE_EXPIRES_ATTR |
  //                     NO_LOOP_ATTR |
  //                     ACTIVATION_GROUP_ATTR |
  //                     DURATION_ATTR |
  //                     TIMER_ATTR |
  //                     CALENDAR_ATTR |
  //                     AUTO_FOCUS_ATTR |
  //                     LOCK_ON_ATTR |
  //                     DIALECT_ATTR
  public static boolean RULE_ATTRIBUTES(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RULE_ATTRIBUTES")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULE_ATTRIBUTES, "<rule attributes>");
    r = COMMENT(b, l + 1);
    if (!r) r = consumeToken(b, CRLF);
    if (!r) r = SALIENCE_ATTR(b, l + 1);
    if (!r) r = ENABLED_ATTR(b, l + 1);
    if (!r) r = DATE_EFFECTIVE_ATTR(b, l + 1);
    if (!r) r = DATE_EXPIRES_ATTR(b, l + 1);
    if (!r) r = NO_LOOP_ATTR(b, l + 1);
    if (!r) r = ACTIVATION_GROUP_ATTR(b, l + 1);
    if (!r) r = DURATION_ATTR(b, l + 1);
    if (!r) r = TIMER_ATTR(b, l + 1);
    if (!r) r = CALENDAR_ATTR(b, l + 1);
    if (!r) r = AUTO_FOCUS_ATTR(b, l + 1);
    if (!r) r = LOCK_ON_ATTR(b, l + 1);
    if (!r) r = DIALECT_ATTR(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "rule" RULE_NAME (RULE_ATTRIBUTES)* "when" LHS "then" RHS "end"
  public static boolean RULE_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RULE_EXPRESSION")) return false;
    if (!nextTokenIs(b, RULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RULE);
    r = r && RULE_NAME(b, l + 1);
    r = r && RULE_EXPRESSION_2(b, l + 1);
    r = r && consumeToken(b, WHEN);
    r = r && LHS(b, l + 1);
    r = r && consumeToken(b, THEN);
    r = r && RHS(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, RULE_EXPRESSION, r);
    return r;
  }

  // (RULE_ATTRIBUTES)*
  private static boolean RULE_EXPRESSION_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RULE_EXPRESSION_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!RULE_EXPRESSION_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RULE_EXPRESSION_2", c)) break;
    }
    return true;
  }

  // (RULE_ATTRIBUTES)
  private static boolean RULE_EXPRESSION_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RULE_EXPRESSION_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RULE_ATTRIBUTES(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_LITERAL
  public static boolean RULE_NAME(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RULE_NAME")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_LITERAL);
    exit_section_(b, m, RULE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // "salience" NUMBER
  public static boolean SALIENCE_ATTR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SALIENCE_ATTR")) return false;
    if (!nextTokenIs(b, SALIENCE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SALIENCE, NUMBER);
    exit_section_(b, m, SALIENCE_ATTR, r);
    return r;
  }

  /* ********************************************************** */
  // "timer" "(" (CRON_TIMER|INT_TIMER) ")"
  public static boolean TIMER_ATTR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TIMER_ATTR")) return false;
    if (!nextTokenIs(b, TIMER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TIMER, L_PAREN);
    r = r && TIMER_ATTR_2(b, l + 1);
    r = r && consumeToken(b, R_PAREN);
    exit_section_(b, m, TIMER_ATTR, r);
    return r;
  }

  // CRON_TIMER|INT_TIMER
  private static boolean TIMER_ATTR_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TIMER_ATTR_2")) return false;
    boolean r;
    r = CRON_TIMER(b, l + 1);
    if (!r) r = INT_TIMER(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // INT_TIMER_EXPR
  public static boolean TIMER_DELAY(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TIMER_DELAY")) return false;
    if (!nextTokenIs(b, INT_TIMER_EXPR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INT_TIMER_EXPR);
    exit_section_(b, m, TIMER_DELAY, r);
    return r;
  }

  /* ********************************************************** */
  // INT_TIMER_EXPR
  public static boolean TIMER_INTERVAL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TIMER_INTERVAL")) return false;
    if (!nextTokenIs(b, INT_TIMER_EXPR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INT_TIMER_EXPR);
    exit_section_(b, m, TIMER_INTERVAL, r);
    return r;
  }

  /* ********************************************************** */
  // ENTRY*
  static boolean dslrFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dslrFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ENTRY(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dslrFile", c)) break;
    }
    return true;
  }

}
