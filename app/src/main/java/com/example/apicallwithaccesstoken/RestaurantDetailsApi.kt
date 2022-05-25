package com.example.apicallwithaccesstoken


import com.example.apicallwithaccesstoken.model.RestaurantDetails
import com.example.apicallwithaccesstoken.model.SampleDataItem
import retrofit2.Call
import retrofit2.http.*

interface RestaurantDetailsApi {
    @FormUrlEncoded
    @POST("/storeList.inc.php")
    fun RestrauntDetails(
        @Field("accountId") accountId: String,
        @Field("accessToken") accessToken: String,
        @Field("service_id") serviceId : String,
        @Field("latitude") latitude: String,
        @Field("longitude") longitude: String,
        @Field("distance_start") distanceStart: String,
        @Field("distance_end") distanceEnd: String
    ) : Call<RestaurantDetails>


    @GET("/{user}")
    fun reposForUser(@Path("user") user: String): Call<List<SampleDataItem>>


}