package com.example.movieupdate.model

data class ReviewWrapper(
    val id: Int,
    val page: Int,
    val totalResults: Int,
    val totalPages: Int,
    val results: List<Review>?,
)