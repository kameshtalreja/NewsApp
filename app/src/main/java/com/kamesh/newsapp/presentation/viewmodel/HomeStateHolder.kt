package com.kamesh.newsapp.presentation.viewmodel

import com.kamesh.newsapp.domain.model.Article

data class HomeStateHolder(
    val isLoading : Boolean = false,
    val data : List<Article>? = null,
    val error : String = ""
    )
