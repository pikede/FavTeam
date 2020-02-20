package com.example.favteam.DependencyInjection

import com.example.favteam.viewmodel.FavTeamViewModel
import com.example.favteam.networkService.LaunchService
import com.example.favteam.repository.Repository
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val FavTeamModule = module {
    single { Repository() }
    single { LaunchService() }
    viewModel { FavTeamViewModel(get()) }
}