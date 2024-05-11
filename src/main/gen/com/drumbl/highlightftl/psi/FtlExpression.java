// This is a generated file. Not intended for manual editing.
package com.drumbl.highlightftl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FtlExpression extends PsiElement {

  @NotNull
  List<FtlExpression> getExpressionList();

  @Nullable
  FtlValue getValue();

  @Nullable
  PsiElement get_Operator_();

}
