package com.app.pravin_unit_testing.network;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\nH\u0007\u00a8\u0006\u001b"}, d2 = {"Lcom/app/pravin_unit_testing/network/Module;", "", "()V", "okHttpInterceptor", "Lokhttp3/Interceptor;", "provideApiHelper", "Lcom/app/pravin_unit_testing/network/ApiHelper;", "apiHelperImpl", "Lcom/app/pravin_unit_testing/network/ApiHelperImpl;", "provideBaseUrl", "", "provideDatabase", "Lcom/app/pravin_unit_testing/localDB/AppDatabase;", "appContext", "Landroid/content/Context;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "providePostDao", "Lcom/app/pravin_unit_testing/localDB/dao/PostDao;", "database", "providerApiService", "Lcom/app/pravin_unit_testing/network/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "providerRetrofit", "okHttpClient", "baseUrl", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class Module {
    @org.jetbrains.annotations.NotNull()
    public static final com.app.pravin_unit_testing.network.Module INSTANCE = null;
    
    private Module() {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String provideBaseUrl() {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit providerRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.Interceptor okHttpInterceptor() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.app.pravin_unit_testing.network.ApiHelper provideApiHelper(@org.jetbrains.annotations.NotNull()
    com.app.pravin_unit_testing.network.ApiHelperImpl apiHelperImpl) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.app.pravin_unit_testing.network.ApiService providerApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.app.pravin_unit_testing.localDB.AppDatabase provideDatabase(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context appContext) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.app.pravin_unit_testing.localDB.dao.PostDao providePostDao(@org.jetbrains.annotations.NotNull()
    com.app.pravin_unit_testing.localDB.AppDatabase database) {
        return null;
    }
}