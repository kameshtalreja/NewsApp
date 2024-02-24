package com.kamesh.newsapp.presentation.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kamesh.newsapp.domain.use_case.NewsArticleUseCase
import com.kamesh.newsapp.util.Resources
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(private val newsArticleUseCase: NewsArticleUseCase) : ViewModel(){

    val article = mutableStateOf(HomeStateHolder())

    init {
        getNewsArticles()
    }

    private fun getNewsArticles() {
        newsArticleUseCase().onEach {
            when(it){
                is Resources.Loading -> {
                    article.value = HomeStateHolder(isLoading = true)
                }
                is Resources.Error -> {
                    article.value = HomeStateHolder(error = it.message.toString())
                }
                is Resources.Success -> {
                    article.value = HomeStateHolder(data = it.data)
                }
            }
        }.launchIn(viewModelScope)
    }

}