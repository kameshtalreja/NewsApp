package com.kamesh.newsapp.domain.use_case

import com.kamesh.newsapp.domain.model.Article
import com.kamesh.newsapp.domain.repository.NewsRepository
import com.kamesh.newsapp.util.Resources
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class NewsArticleUseCase @Inject constructor(private val newsRepository: NewsRepository) {

    operator fun invoke() : Flow<Resources<List<Article>>> = flow {

        emit(Resources.Loading())

        try {
            emit(Resources.Success(newsRepository.getNews()))
        } catch (e : Exception){
          emit(Resources.Error(e.message))
        }

    }
}