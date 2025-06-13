package kela.plugins.dsl.lang.util;

import com.intellij.lang.Commenter;
import org.jetbrains.annotations.Nullable;

public final class DSLCommenter implements Commenter {

  @Override
  public String getLineCommentPrefix() {
    return "#";
  }

  @Override
  public String getBlockCommentPrefix() {
    return null;
  }

  @Nullable
  @Override
  public String getBlockCommentSuffix() {
    return null;
  }

  @Nullable
  @Override
  public String getCommentedBlockCommentPrefix() {
    return null;
  }

  @Nullable
  @Override
  public String getCommentedBlockCommentSuffix() {
    return null;
  }

}

