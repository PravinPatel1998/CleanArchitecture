package com.app.pravin_unit_testing.network

import com.app.pravin_unit_testing.ui.post.PostModel
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {

    override suspend fun getPost() : Response<MutableList<PostModel>>{
        return apiService.getPost()
    }

}