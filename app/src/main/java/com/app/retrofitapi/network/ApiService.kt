package com.app.retrofitapi.network

import com.app.retrofitapi.ui.post.PostModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getPost() : Response<MutableList<PostModel>>


}