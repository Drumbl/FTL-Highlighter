// This is a generated file. Not intended for manual editing.
package com.drumbl.highlightftl.lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.drumbl.highlightftl.psi.FtlTypes.*;
import static com.drumbl.highlightftl.lang.parser.FtlParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class FtlParser implements PsiParser, LightPsiParser {

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
    return ftl_file(b, l + 1);
  }

  /* ********************************************************** */
  // <identifier> '=' <expression>
  public static boolean assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment")) return false;
    if (!nextTokenIs(b, _IDENTIFIER_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _IDENTIFIER_);
    r = r && consumeToken(b, "=");
    r = r && expression(b, l + 1);
    exit_section_(b, m, ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // <identifier> '=' <value>
  public static boolean attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute")) return false;
    if (!nextTokenIs(b, _IDENTIFIER_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _IDENTIFIER_);
    r = r && consumeToken(b, "=");
    r = r && value(b, l + 1);
    exit_section_(b, m, ATTRIBUTE, r);
    return r;
  }

  /* ********************************************************** */
  // <comment_start> <comment_content>* <comment_end>
  public static boolean comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment")) return false;
    if (!nextTokenIs(b, _COMMENT_START_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comment_start(b, l + 1);
    r = r && comment_1(b, l + 1);
    r = r && comment_end(b, l + 1);
    exit_section_(b, m, COMMENT, r);
    return r;
  }

  // <comment_content>*
  private static boolean comment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!comment_content(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "comment_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'regexp:[^\-]+ | "-" [^\-]'
  public static boolean comment_content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment_content")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMENT_CONTENT, "<comment content>");
    r = consumeToken(b, "regexp:[^\\-]+ | \"-\" [^\\-]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "-->"
  public static boolean comment_end(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment_end")) return false;
    if (!nextTokenIs(b, _COMMENT_END_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _COMMENT_END_);
    exit_section_(b, m, COMMENT_END, r);
    return r;
  }

  /* ********************************************************** */
  // "<#--"
  public static boolean comment_start(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment_start")) return false;
    if (!nextTokenIs(b, _COMMENT_START_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _COMMENT_START_);
    exit_section_(b, m, COMMENT_START, r);
    return r;
  }

  /* ********************************************************** */
  // <directive_start> <directive_name> <directive_body> <directive_end>
  //               | <directive_start> <directive_name> <directive_end>
  //               | <directive_close> <directive_name> <directive_end>
  public static boolean directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directive")) return false;
    if (!nextTokenIs(b, "<directive>", _DIRECTIVE_CLOSE_, _DIRECTIVE_START_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIRECTIVE, "<directive>");
    r = parseTokens(b, 0, _DIRECTIVE_START_, _DIRECTIVE_NAME_, _DIRECTIVE_BODY_, _DIRECTIVE_END_);
    if (!r) r = parseTokens(b, 0, _DIRECTIVE_START_, _DIRECTIVE_NAME_, _DIRECTIVE_END_);
    if (!r) r = parseTokens(b, 0, _DIRECTIVE_CLOSE_, _DIRECTIVE_NAME_, _DIRECTIVE_END_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (<attribute>)*
  public static boolean directive_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directive_body")) return false;
    Marker m = enter_section_(b, l, _NONE_, DIRECTIVE_BODY, "<directive body>");
    while (true) {
      int c = current_position_(b);
      if (!attribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "directive_body", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // <identifier>
  public static boolean directive_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directive_name")) return false;
    if (!nextTokenIs(b, _IDENTIFIER_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _IDENTIFIER_);
    exit_section_(b, m, DIRECTIVE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // <value>
  //                | <identifier> ('.' <identifier>)*
  //                | <expression> <operator> <expression>
  //                | '(' <expression> ')'
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = value(b, l + 1);
    if (!r) r = expression_1(b, l + 1);
    if (!r) r = expression(b, l + 1);
    if (!r) r = expression_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <identifier> ('.' <identifier>)*
  private static boolean expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _IDENTIFIER_);
    r = r && expression_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('.' <identifier>)*
  private static boolean expression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_1_1", c)) break;
    }
    return true;
  }

  // '.' <identifier>
  private static boolean expression_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && consumeToken(b, _IDENTIFIER_);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' <expression> ')'
  private static boolean expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <statement>*
  static boolean ftl_file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ftl_file")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ftl_file", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <interpolation_start> <expression> <interpolation_end>
  public static boolean interpolation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolation")) return false;
    if (!nextTokenIs(b, _INTERPOLATION_START_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, _INTERPOLATION_START_, _EXPRESSION_, _INTERPOLATION_END_);
    exit_section_(b, m, INTERPOLATION, r);
    return r;
  }

  /* ********************************************************** */
  // <macro_directive> <identifier> '(' <parameter_list> ')' <directive_body> <directive_end>
  public static boolean macro_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_definition")) return false;
    if (!nextTokenIs(b, _MACRO_DIRECTIVE_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, _MACRO_DIRECTIVE_, _IDENTIFIER_);
    r = r && consumeToken(b, "(");
    r = r && parameter_list(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && directive_body(b, l + 1);
    r = r && consumeToken(b, _DIRECTIVE_END_);
    exit_section_(b, m, MACRO_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // <identifier> (',' <identifier>)*
  public static boolean parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list")) return false;
    if (!nextTokenIs(b, _IDENTIFIER_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, _IDENTIFIER_);
    r = r && parameter_list_1(b, l + 1);
    exit_section_(b, m, PARAMETER_LIST, r);
    return r;
  }

  // (',' <identifier>)*
  private static boolean parameter_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parameter_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameter_list_1", c)) break;
    }
    return true;
  }

  // ',' <identifier>
  private static boolean parameter_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeToken(b, _IDENTIFIER_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <any_char> | <directive> | <assignment> | <macro_definition> | <comment> | CRLF
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = consumeToken(b, _ANY_CHAR_);
    if (!r) r = directive(b, l + 1);
    if (!r) r = assignment(b, l + 1);
    if (!r) r = macro_definition(b, l + 1);
    if (!r) r = comment(b, l + 1);
    if (!r) r = consumeToken(b, CRLF);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <string_literal> | <number_literal> | <boolean_literal> | <text_block> | <interpolation>
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = consumeToken(b, _STRING_LITERAL_);
    if (!r) r = consumeToken(b, _NUMBER_LITERAL_);
    if (!r) r = consumeToken(b, _BOOLEAN_LITERAL_);
    if (!r) r = consumeToken(b, _TEXT_BLOCK_);
    if (!r) r = interpolation(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
