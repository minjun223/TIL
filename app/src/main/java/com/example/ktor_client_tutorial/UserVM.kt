package com.example.ktor_client_tutorial

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class UserVM : ViewModel() {

    val usersFlow = MutableStateFlow<List<User>>(listOf())

    init {
        Log.d("TAG", "UserVM() init called")

        viewModelScope.launch {
            kotlin.runCatching {
                UserRepo.fetchUsers()
            }.onSuccess {fetchedUsers->
                Log.d("TAG", "UserVM() onSuccess")
                usersFlow.value = fetchedUsers
            }.onFailure {
                Log.d("TAG", "UserVM() onFailure")
            }
        }
    }
}