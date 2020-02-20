package com.example.favteam.DependencyInjection

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class FavTeamApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@FavTeamApplication)
            modules(FavTeamModule)
        }
    }
}