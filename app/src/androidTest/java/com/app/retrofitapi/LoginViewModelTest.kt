package com.app.retrofitapi

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.app.pravin_unit_testing.repository.UserManagementRepo
import com.app.pravin_unit_testing.ui.login.LoginViewModel
import com.app.pravin_unit_testing.ui.login.User
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginViewModelTest {

    private lateinit var viewModel: LoginViewModel
    private lateinit var repository: UserManagementRepo

    @Before
    fun setUp(){
        repository = UserManagementRepo()
        viewModel = LoginViewModel(repository)
    }

    @Test
    fun registerSuccess() {
        val user = User("test@example.com", "password123")
        viewModel.register(user)
        assertEquals(true, viewModel.registrationStatus.value)
    }
}