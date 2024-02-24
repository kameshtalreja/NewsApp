package com.kamesh.newsapp.domain.model

import com.google.gson.annotations.SerializedName
import com.kamesh.newsapp.data.model.SourceDTO

data class Article(
    val content: String,
    val description: String,
    val title: String,
    val urlToImage: String
)
