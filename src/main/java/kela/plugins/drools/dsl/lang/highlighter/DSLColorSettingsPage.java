package kela.plugins.drools.dsl.lang.highlighter;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import kela.plugins.drools.Icon;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class DSLColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Keyword", DSLSyntaxHighlighter.WHEN),
            new AttributesDescriptor("Comment", DSLSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("Variables", DSLSyntaxHighlighter.VAR)
    };

    @Override
    public javax.swing.Icon getIcon() {
        return Icon.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new DSLSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return """
        # This is a comment
        
        [when] I called my friend {friendName}=$f.setName({friendName});
        
        [then] ([Hh]e|[Ss]he) picked up the phone=$f.setIsCallable(true);
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
        return "DSL (Drools)";
    }
}