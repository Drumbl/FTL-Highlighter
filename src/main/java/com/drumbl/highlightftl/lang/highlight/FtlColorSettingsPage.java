package com.drumbl.highlightftl.lang.highlight;

import com.drumbl.highlightftl.lang.FtlIcon;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

final class FtlColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Ftl TAG", FtlSyntaxHighlighter.FTL_TAG),
            new AttributesDescriptor("Interpolation", FtlSyntaxHighlighter.INTERPOLATION),
            new AttributesDescriptor("String", FtlSyntaxHighlighter.STRING),
            new AttributesDescriptor("Comment", FtlSyntaxHighlighter.COMMENT)
    };

    @Override
    public Icon getIcon() {
        return FtlIcon.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new FtlSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return """
                <#-- Comment -->
                Apache FreeMarker™ is a template engine: a Java library to generate text output
                (${Html} web pages, e-mails, configuration files, source code, etc.) based on templates and changing data.
                <#list FTL tag>
                    Templates are written in the FreeMarker Template Language (FTL), which is a simple,
                    specialized language (not a full-blown programming language like ${PHP}).
                </#list>
                """;
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "FTL";
    }
}
