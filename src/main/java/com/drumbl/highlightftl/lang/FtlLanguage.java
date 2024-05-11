package com.drumbl.highlightftl.lang;

import com.intellij.lang.Language;

public class FtlLanguage extends Language {

    public static final FtlLanguage INSTANCE = new FtlLanguage();

    private FtlLanguage() {
        super("Ftl");
    }
}
