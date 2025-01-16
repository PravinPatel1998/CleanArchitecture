package com.app.retrofitapi.network

import com.app.retrofitapi.ui.post.PostModel
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {

    override suspend fun getPost() : Response<MutableList<PostModel>>{
        return apiService.getPost()
    }

}