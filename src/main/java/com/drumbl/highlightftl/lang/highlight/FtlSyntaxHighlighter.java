package com.drumbl.highlightftl.lang.highlight;

import com.drumbl.highlightftl.lang.FtlLexerAdapter;
import com.drumbl.highlightftl.psi.FtlTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class FtlSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey FTL_TAG =
            createTextAttributesKey("SIMPLE_KEY", DefaultLanguageHighlighterColors.INSTANCE_METHOD);
    public static final TextAttributesKey INTERPOLATION =
            createTextAttributesKey("SIMPLE_VALUE", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("SIMPLE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey STRING = createTextAttributesKey("STRING", DefaultLanguageHighlighterColors.STRING);


    private static final TextAttributesKey[] FTL_TAG_KEYS = new TextAttributesKey[]{FTL_TAG};
    private static final TextAttributesKey[] INTERPOLATION_KEYS = new TextAttributesKey[]{INTERPOLATION};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new FtlLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {

        if (tokenType.equals(FtlTypes.INTERPOLATION)) {
            return INTERPOLATION_KEYS;
        }
        if (tokenType.equals(FtlTypes._STRING_LITERAL_)) {
            return STRING_KEYS;
        }
        if (tokenType.equals(FtlTypes.COMMENT)) {
            return COMMENT_KEYS;
        }
        if (tokenType.equals(FtlTypes.DIRECTIVE)) {
            return FTL_TAG_KEYS;
        }
        return EMPTY_KEYS;
    }
}
