package com.drumbl.highlightftl.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class FtlFileType extends LanguageFileType {

    public static final FtlFileType INSTANCE = new FtlFileType();

    private FtlFileType() {
        super(FtlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "FTL File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "FTL language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "ftl";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return FtlIcon.FILE;
    }
}
