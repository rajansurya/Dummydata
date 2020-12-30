package com.papaer.gifview

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.society.societygate.repository.RepositoryBind
import com.society.societygate.repository.Resource
import kotlinx.coroutines.Dispatchers
import model.Alldata
import javax.inject.Inject

class MainActivityModel @Inject constructor(var repository: RepositoryBind):ViewModel() {
     fun getGIF() = liveData(Dispatchers.IO) {
        try {
           // emit(Resource.loading(null))
            var data= repository.getImage()
            emit(Resource.success(data))
        }catch (e:Exception){
            emit(Resource.error(null, e.printStackTrace().toString()))

        }

    }


}