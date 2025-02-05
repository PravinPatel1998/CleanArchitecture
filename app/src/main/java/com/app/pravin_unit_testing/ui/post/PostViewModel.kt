package com.app.pravin_unit_testing.ui.post

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.pravin_unit_testing.network.NetworkState
import com.app.pravin_unit_testing.repository.PostRepo
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