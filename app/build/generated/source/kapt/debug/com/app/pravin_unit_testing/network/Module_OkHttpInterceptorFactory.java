package com.app.pravin_unit_testing.network;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import okhttp3.Interceptor;

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
public final class Module_OkHttpInterceptorFactory implements Factory<Interceptor> {
  @Override
  public Interceptor get() {
    return okHttpInterceptor();
  }

  public static Module_OkHttpInterceptorFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Interceptor okHttpInterceptor() {
    return Preconditions.checkNotNullFromProvides(Module.INSTANCE.okHttpInterceptor());
  }

  private static final class InstanceHolder {
    private static final Module_OkHttpInterceptorFactory INSTANCE = new Module_OkHttpInterceptorFactory();
  }
}
