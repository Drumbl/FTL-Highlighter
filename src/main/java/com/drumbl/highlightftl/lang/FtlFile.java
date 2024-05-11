package com.drumbl.highlightftl.lang;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class FtlFile extends PsiFileBase {

    public FtlFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, FtlLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return FtlFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Ftl File";
    }
}
