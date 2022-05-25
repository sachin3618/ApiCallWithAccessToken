package com.example.apicallwithaccesstoken

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    var retrofitService : RestaurantDetailsApi? = null

    fun getInstance(): RestaurantDetailsApi? {
        if (retrofitService == null){
            val retrofit = Retrofit.Builder()
                .baseUrl("https://fidoo.in/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            retrofitService = retrofit.create(RestaurantDetailsApi::class.java)
        }
        return retrofitService

    }
}