package com.app.pravin_unit_testing.repository;

import com.app.pravin_unit_testing.localDB.dao.PostDao;
import com.app.pravin_unit_testing.network.ApiHelper;
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
public final class PostRepo_Factory implements Factory<PostRepo> {
  private final Provider<ApiHelper> apiHelperProvider;

  private final Provider<PostDao> postDaoProvider;

  public PostRepo_Factory(Provider<ApiHelper> apiHelperProvider,
      Provider<PostDao> postDaoProvider) {
    this.apiHelperProvider = apiHelperProvider;
    this.postDaoProvider = postDaoProvider;
  }

  @Override
  public PostRepo get() {
    return newInstance(apiHelperProvider.get(), postDaoProvider.get());
  }

  public static PostRepo_Factory create(Provider<ApiHelper> apiHelperProvider,
      Provider<PostDao> postDaoProvider) {
    return new PostRepo_Factory(apiHelperProvider, postDaoProvider);
  }

  public static PostRepo newInstance(ApiHelper apiHelper, PostDao postDao) {
    return new PostRepo(apiHelper, postDao);
  }
}
