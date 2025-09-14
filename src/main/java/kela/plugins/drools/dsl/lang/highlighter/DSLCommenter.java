package kela.plugins.drools.dsl.lang.highlighter;

import com.intellij.lang.Commenter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DSLCommenter implements Commenter {
    @Override
    public @Nullable String getLineCommentPrefix() {
        return null;
    }

    @Override
    public @NotNull List<String> getLineCommentPrefixes() {
        return List.of("#", "//");
    }

    @Override
    public @Nullable String getBlockCommentPrefix() {
        return null;
    }

    @Override
    public @Nullable String getBlockCommentSuffix() {
        return null;
    }

    @Override
    public @Nullable String getCommentedBlockCommentPrefix() {
        return null;
    }

    @Override
    public @Nullable String getCommentedBlockCommentSuffix() {
        return null;
    }
}