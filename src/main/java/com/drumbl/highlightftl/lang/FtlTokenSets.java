package com.drumbl.highlightftl.lang;

import com.drumbl.highlightftl.psi.FtlElementType;
import com.drumbl.highlightftl.psi.FtlTokenType;
import com.drumbl.highlightftl.psi.FtlTypes;
import com.intellij.psi.tree.TokenSet;
import com.intellij.psi.tree.TokenSet;

public interface FtlTokenSets {

    TokenSet VALUE = TokenSet.create(FtlTypes.VALUE);

    TokenSet ASSIGNMENT = TokenSet.create(FtlTypes.ASSIGNMENT);
    TokenSet ATTRIBUTE = TokenSet.create(FtlTypes.ATTRIBUTE);
    TokenSet COMMENT = TokenSet.create(FtlTypes.COMMENT);
    TokenSet COMMENT_CONTENT = TokenSet.create(FtlTypes.COMMENT_CONTENT);
    TokenSet COMMENT_END = TokenSet.create(FtlTypes.COMMENT_END);
    TokenSet COMMENT_START = TokenSet.create(FtlTypes.COMMENT_START);
    TokenSet DIRECTIVE = TokenSet.create(FtlTypes.DIRECTIVE);
    TokenSet DIRECTIVE_BODY = TokenSet.create(FtlTypes.DIRECTIVE_BODY);
    TokenSet DIRECTIVE_NAME = TokenSet.create(FtlTypes.DIRECTIVE_NAME);
    TokenSet EXPRESSION = TokenSet.create(FtlTypes.EXPRESSION);
    TokenSet INTERPOLATION = TokenSet.create(FtlTypes.INTERPOLATION);
    TokenSet MACRO_DEFINITION = TokenSet.create(FtlTypes.MACRO_DEFINITION);
    TokenSet PARAMETER_LIST = TokenSet.create(FtlTypes.PARAMETER_LIST);
    TokenSet STATEMENT = TokenSet.create(FtlTypes.STATEMENT);
    TokenSet _ASSIGN_DIRECTIVE_ = TokenSet.create(FtlTypes._ASSIGN_DIRECTIVE_);
    TokenSet _ATTRIBUTE_ = TokenSet.create(FtlTypes._ATTRIBUTE_);
    TokenSet _BOOLEAN_LITERAL_ = TokenSet.create(FtlTypes._BOOLEAN_LITERAL_);
    TokenSet _COMMENT_END_ = TokenSet.create(FtlTypes._COMMENT_END_);
    TokenSet _COMMENT_START_ = TokenSet.create(FtlTypes._COMMENT_START_);
    TokenSet _DIRECTIVE_BODY_ = TokenSet.create(FtlTypes._DIRECTIVE_BODY_);
    TokenSet _DIRECTIVE_CLOSE_ = TokenSet.create(FtlTypes._DIRECTIVE_CLOSE_);
    TokenSet _DIRECTIVE_END_ = TokenSet.create(FtlTypes._DIRECTIVE_END_);
    TokenSet _DIRECTIVE_NAME_ = TokenSet.create(FtlTypes._DIRECTIVE_NAME_);
    TokenSet _DIRECTIVE_START_ = TokenSet.create(FtlTypes._DIRECTIVE_START_);
    TokenSet _ELSEIF_DIRECTIVE_ = TokenSet.create(FtlTypes._ELSEIF_DIRECTIVE_);
    TokenSet _ELSE_DIRECTIVE_ = TokenSet.create(FtlTypes._ELSE_DIRECTIVE_);
    TokenSet _EXPRESSION_ = TokenSet.create(FtlTypes._EXPRESSION_);
    TokenSet _FUNCTION_DIRECTIVE_ = TokenSet.create(FtlTypes._FUNCTION_DIRECTIVE_);
    TokenSet _GLOBAL_DIRECTIVE_ = TokenSet.create(FtlTypes._GLOBAL_DIRECTIVE_);
    TokenSet _IDENTIFIER_ = TokenSet.create(FtlTypes._IDENTIFIER_);
    TokenSet _IF_DIRECTIVE_ = TokenSet.create(FtlTypes._IF_DIRECTIVE_);
    TokenSet _IMPORT_DIRECTIVE_ = TokenSet.create(FtlTypes._IMPORT_DIRECTIVE_);
    TokenSet _INCLUDE_DIRECTIVE_ = TokenSet.create(FtlTypes._INCLUDE_DIRECTIVE_);
    TokenSet _INTERPOLATION_END_ = TokenSet.create(FtlTypes._INTERPOLATION_END_);
    TokenSet _INTERPOLATION_START_ = TokenSet.create(FtlTypes._INTERPOLATION_START_);
    TokenSet _LIST_DIRECTIVE_ = TokenSet.create(FtlTypes._LIST_DIRECTIVE_);
    TokenSet _MACRO_DIRECTIVE_ = TokenSet.create(FtlTypes._MACRO_DIRECTIVE_);
    TokenSet _NUMBER_LITERAL_ = TokenSet.create(FtlTypes._NUMBER_LITERAL_);
    TokenSet _OPERATOR_ = TokenSet.create(FtlTypes._OPERATOR_);
    TokenSet _STRING_LITERAL_ = TokenSet.create(FtlTypes._STRING_LITERAL_);
    TokenSet _TEXT_BLOCK_ = TokenSet.create(FtlTypes._TEXT_BLOCK_);
    TokenSet _WHITESPACE_ = TokenSet.create(FtlTypes._WHITESPACE_);
    TokenSet _________ = TokenSet.create(FtlTypes._________);

}
