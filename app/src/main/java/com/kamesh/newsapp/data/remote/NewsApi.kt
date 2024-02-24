package com.kamesh.newsapp.data.remote

import com.kamesh.newsapp.data.model.NewsDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    //https://newsapi.org/v2/top-headlines?country=us&apiKey=16fbdd26c1ec4e17a2912d09c09f47b2

    @GET("top-headlines")
    suspend fun getNews(
        @Query("country") country : String = "us",
        @Query("apiKey") apiKey : String = "16fbdd26c1ec4e17a2912d09c09f47b2"
    ) : Response<NewsDTO>
}