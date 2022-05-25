package com.example.apicallwithaccesstoken

import com.example.apicallwithaccesstoken.model.RestaurantDetails
import com.example.apicallwithaccesstoken.model.SampleDataItem
import retrofit2.Call
import retrofit2.Response

class Repository(val retrofit: RetrofitHelper) {
      fun GetRestrauntDetails(): Call<RestaurantDetails>{
        return retrofit.getInstance()!!.RestrauntDetails("90", "1550130e0ad712ba5f41a2ca471105d5","5", "28.395430799999993", "76.97582060000005", "0", "0" )
    }

   /* fun GetSampleData() : Call<List<SampleDataItem>>? {
        return retrofit.getInstance()?.reposForUser("posts")
    }*/


}