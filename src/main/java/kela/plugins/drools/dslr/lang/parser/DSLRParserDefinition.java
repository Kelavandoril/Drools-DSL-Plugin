package kela.plugins.drools.dslr.lang.parser;

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
import kela.plugins.drools.dslr.lang.DSLR;
import kela.plugins.drools.dslr.lang.DSLRFile;
import kela.plugins.drools.dslr.lang.lexer.DSLRLexerAdapter;
import kela.plugins.drools.dslr.psi.DSLRTypes;
import org.jetbrains.annotations.NotNull;

public class DSLRParserDefinition implements ParserDefinition {
    public static final IFileElementType FILE = new IFileElementType(DSLR.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new DSLRLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return DSLRTokenSets.COMMENT;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new DSLRParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new DSLRFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return DSLRTypes.Factory.createElement(node);
    }
}