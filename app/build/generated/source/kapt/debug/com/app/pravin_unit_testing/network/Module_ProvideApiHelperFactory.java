package com.app.pravin_unit_testing.network;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class Module_ProvideApiHelperFactory implements Factory<ApiHelper> {
  private final Provider<ApiHelperImpl> apiHelperImplProvider;

  public Module_ProvideApiHelperFactory(Provider<ApiHelperImpl> apiHelperImplProvider) {
    this.apiHelperImplProvider = apiHelperImplProvider;
  }

  @Override
  public ApiHelper get() {
    return provideApiHelper(apiHelperImplProvider.get());
  }

  public static Module_ProvideApiHelperFactory create(
      Provider<ApiHelperImpl> apiHelperImplProvider) {
    return new Module_ProvideApiHelperFactory(apiHelperImplProvider);
  }

  public static ApiHelper provideApiHelper(ApiHelperImpl apiHelperImpl) {
    return Preconditions.checkNotNullFromProvides(Module.INSTANCE.provideApiHelper(apiHelperImpl));
  }
}
