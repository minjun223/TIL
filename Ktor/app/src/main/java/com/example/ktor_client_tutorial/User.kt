package com.example.ktor_client_tutorial

@kotlinx.serialization.Serializable

data class User(
    val createdAt: String,
    val name: String,
    val avatar: String,
    val id: String
)
