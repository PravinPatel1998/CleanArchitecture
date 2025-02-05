package com.app.pravin_unit_testing.localDB.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\b"}, d2 = {"Lcom/app/pravin_unit_testing/localDB/dao/PostDao;", "", "getAllPost", "", "Lcom/app/pravin_unit_testing/ui/post/PostModel;", "insertAll", "", "postModel", "app_debug"})
@androidx.room.Dao()
public abstract interface PostDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.app.pravin_unit_testing.ui.post.PostModel> postModel);
    
    @androidx.room.Query(value = "Select * from postmodel")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.app.pravin_unit_testing.ui.post.PostModel> getAllPost();
}