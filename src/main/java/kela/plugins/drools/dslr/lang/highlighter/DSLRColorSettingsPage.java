package kela.plugins.drools.dslr.lang.highlighter;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import kela.plugins.drools.Icon;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class DSLRColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Keyword", DSLRSyntaxHighlighter.WHEN),
            new AttributesDescriptor("Comment", DSLRSyntaxHighlighter.COMMENT),
    };

    @Override
    public javax.swing.Icon getIcon() {
        return Icon.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new DSLRSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return """
                        package org.test;
                                
                        import org.apache.log4j.logger.Logger;
                                
                        expander test.dsl;
                        
                        // This is a comment
                        
                        rule "asdf"
                        salience 50
                        enabled true
                        dialect "mvel"
                        when
                            A test is run named "TestTheRule"
                        then
                            I will test this new rule
                        end
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
        return "DSLR (Drools)";
    }
}