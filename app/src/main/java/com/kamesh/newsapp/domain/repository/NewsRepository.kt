package com.kamesh.newsapp.domain.repository

import com.kamesh.newsapp.domain.model.Article

interface NewsRepository {

    suspend fun getNews() : List<Article>
}