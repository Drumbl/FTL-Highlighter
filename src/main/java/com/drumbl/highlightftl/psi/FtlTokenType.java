package com.drumbl.highlightftl.psi;

import com.drumbl.highlightftl.lang.FtlLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class FtlTokenType extends IElementType {

    public FtlTokenType(@NotNull @NonNls String debugName) {
        super(debugName, FtlLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "FtlTokenType." + super.toString();
    }
}
