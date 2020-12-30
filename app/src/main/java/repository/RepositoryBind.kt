package com.society.societygate.repository

import javax.inject.Inject

class RepositoryBind @Inject constructor(var retrofit:RetrofitCallInterface) {
         suspend fun callFromRepository()=retrofit.userAuthentication(1)
    suspend fun getImage() = retrofit.imageGIF()
}