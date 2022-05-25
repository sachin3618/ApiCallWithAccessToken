package com.example.apicallwithaccesstoken.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.apicallwithaccesstoken.Repository
import com.example.apicallwithaccesstoken.model.RestaurantDetails
import com.example.apicallwithaccesstoken.model.SampleDataItem
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Response

class MainActivityViewModel(val repository: Repository): ViewModel() {
     var restrauntDetails = MutableLiveData<RestaurantDetails>()

     fun fetchRestaurantDetails(): Call<RestaurantDetails>? {
       return repository.GetRestrauntDetails()

    }

   /* fun fetchDataItem() : Call<List<SampleDataItem>>?{
        return repository.GetSampleData()
    }*/


    class MainActivityViewModelFactory(val repository: Repository): ViewModelProvider.Factory{
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return MainActivityViewModel(repository) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }

    }
}