package com.society.societygate.repository

import androidx.lifecycle.LiveData
import com.society.societygate.model.TodoWork
import model.Alldata
import org.json.JSONObject
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

interface RetrofitCallInterface {
    @GET("/todos/{id}")
    @Headers("Content-Type: application/json")
    suspend fun userAuthentication(@Path(value = "id") todoId: Int):TodoWork

    @GET("https://api.giphy.com/v1/gifs/trending?api_key=E3X4VccOxa9DY7kzICw2DYfMPe3WIA7M&limit=25")
    @Headers("Content-Type: application/json")
    suspend fun imageGIF(): Alldata
}