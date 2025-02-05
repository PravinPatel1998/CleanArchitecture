package com.app.pravin_unit_testing.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class UserManagementRepo_Factory implements Factory<UserManagementRepo> {
  @Override
  public UserManagementRepo get() {
    return newInstance();
  }

  public static UserManagementRepo_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static UserManagementRepo newInstance() {
    return new UserManagementRepo();
  }

  private static final class InstanceHolder {
    private static final UserManagementRepo_Factory INSTANCE = new UserManagementRepo_Factory();
  }
}
