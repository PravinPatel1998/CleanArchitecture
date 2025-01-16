package com.app.retrofitapi.network

sealed class NetworkState<T>(
    var status:String?=null,
    var data : T?=null,
    var error : String?=null
    ) {

     class Loading<T> : NetworkState<T>()
     class Success<T>(status: String,data: T) : NetworkState<T>(status, data)
     class Error<T>(error: String) : NetworkState<T>(error)
     class Empty<T>() : NetworkState<T>()


}