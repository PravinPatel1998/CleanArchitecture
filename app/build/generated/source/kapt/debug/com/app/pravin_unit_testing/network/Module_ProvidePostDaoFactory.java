package com.app.pravin_unit_testing.network;

import com.app.pravin_unit_testing.localDB.AppDatabase;
import com.app.pravin_unit_testing.localDB.dao.PostDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class Module_ProvidePostDaoFactory implements Factory<PostDao> {
  private final Provider<AppDatabase> databaseProvider;

  public Module_ProvidePostDaoFactory(Provider<AppDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public PostDao get() {
    return providePostDao(databaseProvider.get());
  }

  public static Module_ProvidePostDaoFactory create(Provider<AppDatabase> databaseProvider) {
    return new Module_ProvidePostDaoFactory(databaseProvider);
  }

  public static PostDao providePostDao(AppDatabase database) {
    return Preconditions.checkNotNullFromProvides(Module.INSTANCE.providePostDao(database));
  }
}
