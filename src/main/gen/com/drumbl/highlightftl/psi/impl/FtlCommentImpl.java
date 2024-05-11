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

public class FtlCommentImpl extends ASTWrapperPsiElement implements FtlComment {

  public FtlCommentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FtlVisitor visitor) {
    visitor.visitComment(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FtlVisitor) accept((FtlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FtlCommentContent> getCommentContentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FtlCommentContent.class);
  }

  @Override
  @NotNull
  public FtlCommentEnd getCommentEnd() {
    return findNotNullChildByClass(FtlCommentEnd.class);
  }

  @Override
  @NotNull
  public FtlCommentStart getCommentStart() {
    return findNotNullChildByClass(FtlCommentStart.class);
  }

}
