package com.drumbl.highlightftl.lang;

import com.drumbl.highlightftl.lang.parser.FtlParser;
import com.drumbl.highlightftl.psi.FtlTypes;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

public class FtlParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(FtlLanguage.INSTANCE);

    @Override
    public @NotNull Lexer createLexer(Project project) {
        return new FtlLexerAdapter();
    }

    @Override
    public @NotNull PsiParser createParser(Project project) {
        return new FtlParser();
    }

    @Override
    public @NotNull IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return FtlTokenSets.COMMENT_CONTENT;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node) {
        return FtlTypes.Factory.createElement(node);
    }

    @Override
    public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new FtlFile(viewProvider);
    }
}
