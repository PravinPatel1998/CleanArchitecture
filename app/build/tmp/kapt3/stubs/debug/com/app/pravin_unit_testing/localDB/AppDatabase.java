package com.app.pravin_unit_testing.localDB;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/app/pravin_unit_testing/localDB/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "postDao", "Lcom/app/pravin_unit_testing/localDB/dao/PostDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.app.pravin_unit_testing.ui.post.PostModel.class}, version = 1)
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile com.app.pravin_unit_testing.localDB.AppDatabase instance;
    @org.jetbrains.annotations.NotNull()
    public static final com.app.pravin_unit_testing.localDB.AppDatabase.Companion Companion = null;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.app.pravin_unit_testing.localDB.dao.PostDao postDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/app/pravin_unit_testing/localDB/AppDatabase$Companion;", "", "()V", "instance", "Lcom/app/pravin_unit_testing/localDB/AppDatabase;", "getInstance", "()Lcom/app/pravin_unit_testing/localDB/AppDatabase;", "setInstance", "(Lcom/app/pravin_unit_testing/localDB/AppDatabase;)V", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.app.pravin_unit_testing.localDB.AppDatabase getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.Nullable()
        com.app.pravin_unit_testing.localDB.AppDatabase p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.pravin_unit_testing.localDB.AppDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}