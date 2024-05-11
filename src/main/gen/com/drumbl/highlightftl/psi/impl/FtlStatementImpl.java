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

public class FtlStatementImpl extends ASTWrapperPsiElement implements FtlStatement {

  public FtlStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FtlVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FtlVisitor) accept((FtlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FtlAssignment getAssignment() {
    return findChildByClass(FtlAssignment.class);
  }

  @Override
  @Nullable
  public FtlComment getComment() {
    return findChildByClass(FtlComment.class);
  }

  @Override
  @Nullable
  public FtlDirective getDirective() {
    return findChildByClass(FtlDirective.class);
  }

  @Override
  @Nullable
  public FtlMacroDefinition getMacroDefinition() {
    return findChildByClass(FtlMacroDefinition.class);
  }

  @Override
  @Nullable
  public PsiElement get_AnyChar_() {
    return findChildByType(_ANY_CHAR_);
  }

}
