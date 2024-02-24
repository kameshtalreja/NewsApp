package com.kamesh.newsapp.domain.di

import com.kamesh.newsapp.data.remote.NewsApi
import com.kamesh.newsapp.data.repository.NewsRepositoryImpl
import com.kamesh.newsapp.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DomainModule {

    @Provides
    @Singleton
    fun provideGetNewsRepo(api: NewsApi) : NewsRepository{
        return NewsRepositoryImpl(api)
    }
}