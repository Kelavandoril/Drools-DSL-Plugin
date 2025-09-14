package kela.plugins.drools.dsl.lang.parser;

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
import kela.plugins.drools.dsl.lang.DSL;
import kela.plugins.drools.dsl.lang.DSLFile;
import kela.plugins.drools.dsl.lang.lexer.DSLLexerAdapter;
import kela.plugins.drools.dsl.psi.DSLTypes;
import org.jetbrains.annotations.NotNull;

public class DSLParserDefinition implements ParserDefinition {
    public static final IFileElementType FILE = new IFileElementType(DSL.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new DSLLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return DSLTokenSets.COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new DSLParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new DSLFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return DSLTypes.Factory.createElement(node);
    }
}