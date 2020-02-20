package com.example.favteam.networkService

import com.example.favteam.networkService.FaveTeamApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class LaunchService {

    companion object{
        val BASE_URL = "https://www.thesportsdb.com/api/v1/json/1/"

        private val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        val launchApi = retrofit.create(FaveTeamApi::class.java)
    }
}