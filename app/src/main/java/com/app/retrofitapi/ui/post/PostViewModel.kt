package com.app.retrofitapi.ui.post

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.retrofitapi.network.NetworkState
import com.app.retrofitapi.repository.PostRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PostViewModel @Inject constructor(private val postRepo: PostRepo) : ViewModel() {
    private val _postList = MutableStateFlow<NetworkState<MutableList<PostModel>>>(NetworkState.Empty())
    val postListResponse : StateFlow<NetworkState<MutableList<PostModel>>> = _postList
    fun getPost()  {
        viewModelScope.launch {
            _postList.emit(NetworkState.Loading())
            _postList.emit(postRepo.getPost())

        }
    }
}