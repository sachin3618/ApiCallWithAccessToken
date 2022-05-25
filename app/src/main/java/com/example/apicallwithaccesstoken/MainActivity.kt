package com.example.apicallwithaccesstoken

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.apicallwithaccesstoken.model.RestaurantDetails
import com.example.apicallwithaccesstoken.model.SampleDataItem
import com.example.apicallwithaccesstoken.viewModel.MainActivityViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val retrofitHelper = RetrofitHelper
        val repository = Repository(retrofitHelper)

        val viewModelFactory = MainActivityViewModel.MainActivityViewModelFactory(repository)
        val values = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)
     /*   val retroValue = values.fetchRestaurantDetails()*/
        values.fetchRestaurantDetails()!!.enqueue(object : Callback<RestaurantDetails>{
            override fun onResponse(
                call: Call<RestaurantDetails>,
                response: Response<RestaurantDetails>
            ) {
                Log.i("message", "${response.body()}")
            }

            override fun onFailure(call: Call<RestaurantDetails>, t: Throwable) {
                    TODO("Not yet implemented")
            }

        })




    }
}