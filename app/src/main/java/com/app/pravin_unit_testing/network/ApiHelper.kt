package com.app.pravin_unit_testing.network

import com.app.pravin_unit_testing.ui.post.PostModel
import retrofit2.Response

interface ApiHelper {

    suspend fun getPost() : Response<MutableList<PostModel>>
}