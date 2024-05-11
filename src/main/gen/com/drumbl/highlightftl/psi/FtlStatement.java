// This is a generated file. Not intended for manual editing.
package com.drumbl.highlightftl.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FtlStatement extends PsiElement {

  @Nullable
  FtlAssignment getAssignment();

  @Nullable
  FtlComment getComment();

  @Nullable
  FtlDirective getDirective();

  @Nullable
  FtlMacroDefinition getMacroDefinition();

  @Nullable
  PsiElement get_AnyChar_();

}
