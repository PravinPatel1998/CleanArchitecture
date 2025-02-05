package com.app.pravin_unit_testing.ui.post;

import com.app.pravin_unit_testing.repository.PostRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class PostViewModel_Factory implements Factory<PostViewModel> {
  private final Provider<PostRepo> postRepoProvider;

  public PostViewModel_Factory(Provider<PostRepo> postRepoProvider) {
    this.postRepoProvider = postRepoProvider;
  }

  @Override
  public PostViewModel get() {
    return newInstance(postRepoProvider.get());
  }

  public static PostViewModel_Factory create(Provider<PostRepo> postRepoProvider) {
    return new PostViewModel_Factory(postRepoProvider);
  }

  public static PostViewModel newInstance(PostRepo postRepo) {
    return new PostViewModel(postRepo);
  }
}
