package com.kamesh.newsapp.mapper

import com.kamesh.newsapp.data.model.ArticleDTO
import com.kamesh.newsapp.domain.model.Article

fun List<ArticleDTO>.toDomain() : List<Article> {

    return map {
        Article(
            content = it.content ?: "",
            description = it.description ?: "",
            title = it.title ?: "",
            urlToImage = it.urlToImage ?: ""
        )
    }
}