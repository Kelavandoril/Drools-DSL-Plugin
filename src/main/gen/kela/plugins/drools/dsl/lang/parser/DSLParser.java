// This is a generated file. Not intended for manual editing.
package kela.plugins.drools.dsl.lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static kela.plugins.drools.dsl.psi.DSLTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DSLParser implements PsiParser, LightPsiParser {

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
    return dslFile(b, l + 1);
  }

  /* ********************************************************** */
  // ("//"|"#") STRING_TOKEN* CRLF
  public static boolean COMMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COMMENT")) return false;
    if (!nextTokenIs(b, "<comment>", HASH, SLASH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMENT, "<comment>");
    r = COMMENT_0(b, l + 1);
    r = r && COMMENT_1(b, l + 1);
    r = r && consumeToken(b, CRLF);
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

  /* ********************************************************** */
  // ("#/") STRING_TOKEN* CRLF
  public static boolean DEBUG_COMMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DEBUG_COMMENT")) return false;
    if (!nextTokenIs(b, DEBUG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEBUG);
    r = r && DEBUG_COMMENT_1(b, l + 1);
    r = r && consumeToken(b, CRLF);
    exit_section_(b, m, DEBUG_COMMENT, r);
    return r;
  }

  // STRING_TOKEN*
  private static boolean DEBUG_COMMENT_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DEBUG_COMMENT_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, STRING_TOKEN)) break;
      if (!empty_element_parsed_guard_(b, "DEBUG_COMMENT_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // COMMENT |
  //           DEBUG_COMMENT |
  //           CRLF |
  //           WHEN_EXPRESSION |
  //           THEN_EXPRESSION |
  //           KEYWORD_EXPRESSION
  public static boolean ENTRY(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ENTRY")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTRY, "<entry>");
    r = COMMENT(b, l + 1);
    if (!r) r = DEBUG_COMMENT(b, l + 1);
    if (!r) r = consumeToken(b, CRLF);
    if (!r) r = WHEN_EXPRESSION(b, l + 1);
    if (!r) r = THEN_EXPRESSION(b, l + 1);
    if (!r) r = KEYWORD_EXPRESSION(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // JAVA
  public static boolean JAVA_CODE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "JAVA_CODE")) return false;
    if (!nextTokenIs(b, JAVA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, JAVA);
    exit_section_(b, m, JAVA_CODE, r);
    return r;
  }

  /* ********************************************************** */
  // "[keyword]" (STRING_TOKEN)+ "=" (JAVA_CODE)+
  public static boolean KEYWORD_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_EXPRESSION")) return false;
    if (!nextTokenIs(b, KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD);
    r = r && KEYWORD_EXPRESSION_1(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && KEYWORD_EXPRESSION_3(b, l + 1);
    exit_section_(b, m, KEYWORD_EXPRESSION, r);
    return r;
  }

  // (STRING_TOKEN)+
  private static boolean KEYWORD_EXPRESSION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_EXPRESSION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_TOKEN);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, STRING_TOKEN)) break;
      if (!empty_element_parsed_guard_(b, "KEYWORD_EXPRESSION_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (JAVA_CODE)+
  private static boolean KEYWORD_EXPRESSION_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_EXPRESSION_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = KEYWORD_EXPRESSION_3_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!KEYWORD_EXPRESSION_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "KEYWORD_EXPRESSION_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (JAVA_CODE)
  private static boolean KEYWORD_EXPRESSION_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_EXPRESSION_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = JAVA_CODE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VARIABLE
  public static boolean LHS_VARIABLE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LHS_VARIABLE")) return false;
    if (!nextTokenIs(b, VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VARIABLE);
    exit_section_(b, m, LHS_VARIABLE, r);
    return r;
  }

  /* ********************************************************** */
  // VARIABLE
  public static boolean RHS_VARIABLE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RHS_VARIABLE")) return false;
    if (!nextTokenIs(b, VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VARIABLE);
    exit_section_(b, m, RHS_VARIABLE, r);
    return r;
  }

  /* ********************************************************** */
  // "[then]" (STRING_TOKEN | LHS_VARIABLE)+ "=" (JAVA_CODE | RHS_VARIABLE | CRLF)+
  public static boolean THEN_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "THEN_EXPRESSION")) return false;
    if (!nextTokenIs(b, THEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THEN);
    r = r && THEN_EXPRESSION_1(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && THEN_EXPRESSION_3(b, l + 1);
    exit_section_(b, m, THEN_EXPRESSION, r);
    return r;
  }

  // (STRING_TOKEN | LHS_VARIABLE)+
  private static boolean THEN_EXPRESSION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "THEN_EXPRESSION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = THEN_EXPRESSION_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!THEN_EXPRESSION_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "THEN_EXPRESSION_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING_TOKEN | LHS_VARIABLE
  private static boolean THEN_EXPRESSION_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "THEN_EXPRESSION_1_0")) return false;
    boolean r;
    r = consumeToken(b, STRING_TOKEN);
    if (!r) r = LHS_VARIABLE(b, l + 1);
    return r;
  }

  // (JAVA_CODE | RHS_VARIABLE | CRLF)+
  private static boolean THEN_EXPRESSION_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "THEN_EXPRESSION_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = THEN_EXPRESSION_3_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!THEN_EXPRESSION_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "THEN_EXPRESSION_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // JAVA_CODE | RHS_VARIABLE | CRLF
  private static boolean THEN_EXPRESSION_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "THEN_EXPRESSION_3_0")) return false;
    boolean r;
    r = JAVA_CODE(b, l + 1);
    if (!r) r = RHS_VARIABLE(b, l + 1);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  /* ********************************************************** */
  // "[when]" (STRING_TOKEN | LHS_VARIABLE)+ "=" (JAVA_CODE | RHS_VARIABLE | CRLF)+
  public static boolean WHEN_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WHEN_EXPRESSION")) return false;
    if (!nextTokenIs(b, WHEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && WHEN_EXPRESSION_1(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && WHEN_EXPRESSION_3(b, l + 1);
    exit_section_(b, m, WHEN_EXPRESSION, r);
    return r;
  }

  // (STRING_TOKEN | LHS_VARIABLE)+
  private static boolean WHEN_EXPRESSION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WHEN_EXPRESSION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WHEN_EXPRESSION_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!WHEN_EXPRESSION_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "WHEN_EXPRESSION_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING_TOKEN | LHS_VARIABLE
  private static boolean WHEN_EXPRESSION_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WHEN_EXPRESSION_1_0")) return false;
    boolean r;
    r = consumeToken(b, STRING_TOKEN);
    if (!r) r = LHS_VARIABLE(b, l + 1);
    return r;
  }

  // (JAVA_CODE | RHS_VARIABLE | CRLF)+
  private static boolean WHEN_EXPRESSION_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WHEN_EXPRESSION_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WHEN_EXPRESSION_3_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!WHEN_EXPRESSION_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "WHEN_EXPRESSION_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // JAVA_CODE | RHS_VARIABLE | CRLF
  private static boolean WHEN_EXPRESSION_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WHEN_EXPRESSION_3_0")) return false;
    boolean r;
    r = JAVA_CODE(b, l + 1);
    if (!r) r = RHS_VARIABLE(b, l + 1);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  /* ********************************************************** */
  // ENTRY*
  static boolean dslFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dslFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ENTRY(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dslFile", c)) break;
    }
    return true;
  }

}
