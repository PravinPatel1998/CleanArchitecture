package com.app.pravin_unit_testing.network;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class Module_ProviderApiServiceFactory implements Factory<ApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public Module_ProviderApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiService get() {
    return providerApiService(retrofitProvider.get());
  }

  public static Module_ProviderApiServiceFactory create(Provider<Retrofit> retrofitProvider) {
    return new Module_ProviderApiServiceFactory(retrofitProvider);
  }

  public static ApiService providerApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(Module.INSTANCE.providerApiService(retrofit));
  }
}
