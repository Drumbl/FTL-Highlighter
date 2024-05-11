package com.drumbl.highlightftl.lang;

import com.intellij.lexer.FlexAdapter;

public class FtlLexerAdapter extends FlexAdapter {

    public FtlLexerAdapter() {
        super(new FtlLexer(null));
    }
}
