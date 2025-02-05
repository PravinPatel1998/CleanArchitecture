package com.app.pravin_unit_testing.localDB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.app.pravin_unit_testing.localDB.dao.PostDao
import com.app.pravin_unit_testing.ui.post.PostModel

@Database(entities = [PostModel::class] , version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun postDao() : PostDao

    companion object{
        @Volatile
        var instance : AppDatabase?= null
        fun getInstance(context: Context) : AppDatabase =
            instance ?: synchronized(this){
                    instance ?: Room.databaseBuilder(
                        context,
                        AppDatabase::class.java, "RetrofitDemoDB"
                    ).allowMainThreadQueries()
                        .build().also {
                        instance = it
                    }
                }







    }




}