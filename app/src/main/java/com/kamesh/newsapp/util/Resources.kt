package com.kamesh.newsapp.util

sealed class Resources<T>(val data : T? = null, val message: String? = null) {

    class Success<T>(data: T?) : Resources<T>(data = data)
    class Loading<T>() : Resources<T>()
    class Error<T>(message: String?) : Resources<T>(message = message)
}