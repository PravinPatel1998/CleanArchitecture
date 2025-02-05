package com.app.pravin_unit_testing.repository

import com.app.pravin_unit_testing.ui.login.User
import javax.inject.Inject

class UserManagementRepo @Inject constructor() {
    private val userList = mutableListOf<User>()

    fun register(user: User): Boolean {
        if (userList.any { it.email == user.email }) return false
        userList.add(user)
        return true
    }

    fun login(email: String, password: String): Boolean {
        return userList.any { it.email == email && it.password == password }
    }
}