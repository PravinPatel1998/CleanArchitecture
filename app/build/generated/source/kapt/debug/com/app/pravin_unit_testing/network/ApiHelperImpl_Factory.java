package com.app.pravin_unit_testing.network;

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
public final class ApiHelperImpl_Factory implements Factory<ApiHelperImpl> {
  private final Provider<ApiService> apiServiceProvider;

  public ApiHelperImpl_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public ApiHelperImpl get() {
    return newInstance(apiServiceProvider.get());
  }

  public static ApiHelperImpl_Factory create(Provider<ApiService> apiServiceProvider) {
    return new ApiHelperImpl_Factory(apiServiceProvider);
  }

  public static ApiHelperImpl newInstance(ApiService apiService) {
    return new ApiHelperImpl(apiService);
  }
}
