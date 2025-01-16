package com.app.retrofitapi.ui.post

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.app.retrofitapi.databinding.FragmentPostBinding
import com.app.retrofitapi.network.NetworkState
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class Post : Fragment() {
    private val postViewModel: PostViewModel by viewModels()
    private lateinit var binding : FragmentPostBinding
    private var postAdapter : PostAdapter?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPostBinding.inflate(layoutInflater)
        return binding.root
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        postViewModel.getPost()
        postAdapter = PostAdapter(mutableListOf())
        binding.rvPost.adapter = postAdapter

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED){
                postViewModel.postListResponse.collect{
                    when(it){
                        is NetworkState.Loading ->{
                            binding.progressCircular.visibility = View.VISIBLE
                        }
                        is NetworkState.Error -> {
                            binding.progressCircular.visibility = View.GONE
                            Toast.makeText(requireContext(),"",Toast.LENGTH_SHORT).show()
                        }
                        is NetworkState.Success -> {
                            binding.progressCircular.visibility = View.GONE
                            postAdapter?.list = it.data!!
                            postAdapter?.notifyDataSetChanged()
                        }
                        else ->{}
                    }
                }
            }
        }
    }
}