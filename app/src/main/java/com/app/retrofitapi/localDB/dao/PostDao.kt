package com.app.retrofitapi.localDB.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.app.retrofitapi.ui.post.PostModel

@Dao
interface PostDao  {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(postModel: MutableList<PostModel>)

    @Query("Select * from postmodel")
    fun getAllPost() : MutableList<PostModel>
}