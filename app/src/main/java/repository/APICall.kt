package com.society.societygate.repository

import androidx.lifecycle.LiveData
import com.society.societygate.model.TodoWork
import org.json.JSONObject
import retrofit2.Retrofit
import javax.inject.Inject

class APICall @Inject constructor(var retrofit:RetrofitCallInterface){
     suspend fun getUserAuthentication():TodoWork = retrofit.userAuthentication(1)
}