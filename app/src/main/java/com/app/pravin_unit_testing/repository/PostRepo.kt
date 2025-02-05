package com.app.pravin_unit_testing.repository

import com.app.pravin_unit_testing.localDB.dao.PostDao
import com.app.pravin_unit_testing.network.ApiHelper
import com.app.pravin_unit_testing.network.NetworkState
import com.app.pravin_unit_testing.ui.post.PostModel
import javax.inject.Inject

class PostRepo @Inject constructor(private val apiHelper: ApiHelper, private val postDao: PostDao) {
    suspend fun getPost(): NetworkState<MutableList<PostModel>> {
        return try {
            NetworkState.Success("", postDao.getAllPost())
            val response = apiHelper.getPost()
            if (response.isSuccessful) {
                postDao.insertAll(response.body()!!)
                NetworkState.Success("", response.body()!!)
            } else {
                NetworkState.Error(error = response.message())
            }
        } catch (e: Exception) {
            e.printStackTrace()
            val offlineList = postDao.getAllPost()
            if (offlineList.isNotEmpty()) {
                NetworkState.Success("", postDao.getAllPost())
            } else {
                NetworkState.Error(error = e.message!!)
            }

        }


    }

}