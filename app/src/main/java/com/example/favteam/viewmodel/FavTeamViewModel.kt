package com.example.favteam.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.favteam.Models.Teams
import com.example.favteam.repository.Repository

class FavTeamViewModel(private val repository: Repository) : ViewModel() {

    fun getLaunches(enteredName: String): MutableLiveData<Teams> {
        repository.getLaunches(enteredName)
        return repository.getLaunchList()
    }

//    fun getSortedLaunchList(dataset: List<Launch>): List<Launch> {
//        var map = mutableMapOf<Int, Launch>()
//        for (launch in dataset) {
//            var launchYear = launch.launchYear.toInt()
//            map[launchYear] = launch
//        }
//        return map.toSortedMap().values.reversed()
//    }

}
