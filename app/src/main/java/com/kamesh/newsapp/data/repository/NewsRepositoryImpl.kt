package com.kamesh.newsapp.data.repository

import com.kamesh.newsapp.data.remote.NewsApi
import com.kamesh.newsapp.domain.model.Article
import com.kamesh.newsapp.domain.repository.NewsRepository
import com.kamesh.newsapp.mapper.toDomain
import com.kamesh.newsapp.util.SafeApiRequest
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(
    private val newsApi: NewsApi
) : NewsRepository, SafeApiRequest(){

    override suspend fun getNews(): List<Article> {

        val response = safeApiRequest { newsApi.getNews() }
        return response.articles?.toDomain().orEmpty()
    }

}