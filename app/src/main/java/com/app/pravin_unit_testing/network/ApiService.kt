package com.app.pravin_unit_testing.network

import com.app.pravin_unit_testing.ui.post.PostModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getPost() : Response<MutableList<PostModel>>


}