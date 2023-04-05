package com.example.ktor_client_tutorial

import io.ktor.client.request.get
object UserRepo {

    suspend fun fetchUsers(): List<User>{
        val url = "https://615075ada706cd00179b745c.mockapi.io/users"
//        return KtorClient.httpClient.get("")
        return KtorClient.httpClient.use {
            it.get(url)
        }
    }
}