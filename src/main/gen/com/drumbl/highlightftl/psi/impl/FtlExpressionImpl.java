// This is a generated file. Not intended for manual editing.
package com.drumbl.highlightftl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.drumbl.highlightftl.psi.FtlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.drumbl.highlightftl.psi.*;

public class FtlExpressionImpl extends ASTWrapperPsiElement implements FtlExpression {

  public FtlExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FtlVisitor visitor) {
    visitor.visitExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FtlVisitor) accept((FtlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FtlExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FtlExpression.class);
  }

  @Override
  @Nullable
  public FtlValue getValue() {
    return findChildByClass(FtlValue.class);
  }

  @Override
  @Nullable
  public PsiElement get_Operator_() {
    return findChildByType(_OPERATOR_);
  }

}
