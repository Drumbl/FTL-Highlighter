// This is a generated file. Not intended for manual editing.
package com.drumbl.highlightftl.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.drumbl.highlightftl.psi.impl.*;

public interface FtlTypes {

  IElementType ASSIGNMENT = new FtlElementType("ASSIGNMENT");
  IElementType ATTRIBUTE = new FtlElementType("ATTRIBUTE");
  IElementType COMMENT = new FtlElementType("COMMENT");
  IElementType COMMENT_CONTENT = new FtlElementType("COMMENT_CONTENT");
  IElementType COMMENT_END = new FtlElementType("COMMENT_END");
  IElementType COMMENT_START = new FtlElementType("COMMENT_START");
  IElementType DIRECTIVE = new FtlElementType("DIRECTIVE");
  IElementType DIRECTIVE_BODY = new FtlElementType("DIRECTIVE_BODY");
  IElementType DIRECTIVE_NAME = new FtlElementType("DIRECTIVE_NAME");
  IElementType EXPRESSION = new FtlElementType("EXPRESSION");
  IElementType INTERPOLATION = new FtlElementType("INTERPOLATION");
  IElementType MACRO_DEFINITION = new FtlElementType("MACRO_DEFINITION");
  IElementType PARAMETER_LIST = new FtlElementType("PARAMETER_LIST");
  IElementType STATEMENT = new FtlElementType("STATEMENT");
  IElementType VALUE = new FtlElementType("VALUE");

  IElementType CRLF = new FtlTokenType("CRLF");
  //IElementType _ = new FtlTokenType("'");
  IElementType _ANY_CHAR_ = new FtlTokenType("<any_char>");
  IElementType _ASSIGN_DIRECTIVE_ = new FtlTokenType("assign");
  IElementType _ATTRIBUTE_ = new FtlTokenType("<attribute>");
  IElementType _BOOLEAN_LITERAL_ = new FtlTokenType("<boolean_literal>");
  IElementType _COMMENT_END_ = new FtlTokenType("-->");
  IElementType _COMMENT_START_ = new FtlTokenType("<#--");
  IElementType _DIRECTIVE_BODY_ = new FtlTokenType("<directive_body>");
  IElementType _DIRECTIVE_CLOSE_ = new FtlTokenType("</#");
  IElementType _DIRECTIVE_END_ = new FtlTokenType(">");
  IElementType _DIRECTIVE_NAME_ = new FtlTokenType("<directive_name>");
  IElementType _DIRECTIVE_START_ = new FtlTokenType("<#");
  IElementType _ELSEIF_DIRECTIVE_ = new FtlTokenType("elseif");
  IElementType _ELSE_DIRECTIVE_ = new FtlTokenType("else");
  IElementType _EXPRESSION_ = new FtlTokenType("<expression>");
  IElementType _FUNCTION_DIRECTIVE_ = new FtlTokenType("function");
  IElementType _GLOBAL_DIRECTIVE_ = new FtlTokenType("global");
  IElementType _IDENTIFIER_ = new FtlTokenType("<identifier>");
  IElementType _IF_DIRECTIVE_ = new FtlTokenType("if");
  IElementType _IMPORT_DIRECTIVE_ = new FtlTokenType("import");
  IElementType _INCLUDE_DIRECTIVE_ = new FtlTokenType("include");
  IElementType _INTERPOLATION_END_ = new FtlTokenType("}");
  IElementType _INTERPOLATION_START_ = new FtlTokenType("${");
  IElementType _LIST_DIRECTIVE_ = new FtlTokenType("list");
  IElementType _MACRO_DIRECTIVE_ = new FtlTokenType("macro");
  IElementType _NUMBER_LITERAL_ = new FtlTokenType("<number_literal>");
  IElementType _OPERATOR_ = new FtlTokenType("<operator>");
  IElementType _STRING_LITERAL_ = new FtlTokenType("<string_literal>");
  IElementType _TEXT_BLOCK_ = new FtlTokenType("<text_block>");
  IElementType _WHITESPACE_ = new FtlTokenType("<whitespace>");
  IElementType _________ = new FtlTokenType(" (~[\"])* ");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ASSIGNMENT) {
        return new FtlAssignmentImpl(node);
      }
      else if (type == ATTRIBUTE) {
        return new FtlAttributeImpl(node);
      }
      else if (type == COMMENT) {
        return new FtlCommentImpl(node);
      }
      else if (type == COMMENT_CONTENT) {
        return new FtlCommentContentImpl(node);
      }
      else if (type == COMMENT_END) {
        return new FtlCommentEndImpl(node);
      }
      else if (type == COMMENT_START) {
        return new FtlCommentStartImpl(node);
      }
      else if (type == DIRECTIVE) {
        return new FtlDirectiveImpl(node);
      }
      else if (type == DIRECTIVE_BODY) {
        return new FtlDirectiveBodyImpl(node);
      }
      else if (type == DIRECTIVE_NAME) {
        return new FtlDirectiveNameImpl(node);
      }
      else if (type == EXPRESSION) {
        return new FtlExpressionImpl(node);
      }
      else if (type == INTERPOLATION) {
        return new FtlInterpolationImpl(node);
      }
      else if (type == MACRO_DEFINITION) {
        return new FtlMacroDefinitionImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new FtlParameterListImpl(node);
      }
      else if (type == STATEMENT) {
        return new FtlStatementImpl(node);
      }
      else if (type == VALUE) {
        return new FtlValueImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
