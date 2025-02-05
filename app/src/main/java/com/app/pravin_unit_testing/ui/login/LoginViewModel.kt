package com.app.pravin_unit_testing.ui.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.pravin_unit_testing.repository.UserManagementRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val repository: UserManagementRepo) : ViewModel() {
    val loginStatus = MutableLiveData<Boolean>()
    val registrationStatus = MutableLiveData<Boolean>()

    fun register(user: User) {
        registrationStatus.value = repository.register(user)
    }

    fun login(email: String, password: String) {
        loginStatus.value = repository.login(email, password)
    }
}