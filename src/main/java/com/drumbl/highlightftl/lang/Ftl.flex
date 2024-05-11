package com.drumbl.highlightftl.lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.drumbl.highlightftl.psi.FtlTypes;
import com.intellij.psi.TokenType;

%%

%class FtlLexer
%implements FlexLexer
%unicode
%function advance
%public
%type IElementType
%state DOTALL
%eof{  return;
%eof}

// Макросы
FTL_VAR = \$\{[^}]*\}
FTL_COMMENT = <#--.*?-->
FTL_TAG = <#[a-z]+[ ]*[^>]*>|<\/#[a-z]+>
OTHER = .|\n

%%

// Правила
<YYINITIAL> {
  {FTL_VAR}    { return FtlTypes.INTERPOLATION; }
  {FTL_COMMENT}  { return FtlTypes.COMMENT; }
  {FTL_TAG}      { return FtlTypes.DIRECTIVE; }
  {OTHER}      { return FtlTypes._STRING_LITERAL_; }
}
