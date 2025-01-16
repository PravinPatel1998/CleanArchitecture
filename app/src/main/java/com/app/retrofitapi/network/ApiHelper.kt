package com.app.retrofitapi.network

import com.app.retrofitapi.ui.post.PostModel
import retrofit2.Response

interface ApiHelper {

    suspend fun getPost() : Response<MutableList<PostModel>>
}