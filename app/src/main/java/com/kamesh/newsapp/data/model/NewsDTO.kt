package com.kamesh.newsapp.data.model


import com.google.gson.annotations.SerializedName

data class NewsDTO(
    @SerializedName("articles")
    val articles: List<ArticleDTO>? = null,
    @SerializedName("status")
    val status: String? = null,
    @SerializedName("totalResults")
    val totalResults: Int? = null
)