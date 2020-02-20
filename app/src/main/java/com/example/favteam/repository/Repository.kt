package com.example.favteam.repository;

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.favteam.Models.Teams
import com.example.favteam.networkService.LaunchService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {

    var mLaunches = MutableLiveData<Teams>()

    fun getLaunches(enteredTeamName: String) {
            val launchesCall = LaunchService.launchApi.listAllLaunches(enteredTeamName)
            launchesCall.enqueue(object : Callback<Teams> {
                override fun onFailure(call: Call<Teams>, t: Throwable) {
                    Log.d("error", t.message)
                }

                override fun onResponse(call: Call<Teams>, response: Response<Teams>) {
                    response.body()?.let { teamNames ->
                        mLaunches.value = teamNames
                    }
                }

            })
    }

    fun getLaunchList() = mLaunches

}
