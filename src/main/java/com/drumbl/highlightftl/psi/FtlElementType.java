package com.drumbl.highlightftl.psi;

import com.drumbl.highlightftl.lang.FtlLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class FtlElementType extends IElementType {

    public FtlElementType(@NotNull @NonNls String debugName) {
        super(debugName, FtlLanguage.INSTANCE);
    }
}
