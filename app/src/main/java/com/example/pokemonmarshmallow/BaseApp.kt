package com.example.pokemonmarshmallow

import android.app.Application
import com.example.pokemonmarshmallow.di.component.AppComponent
import com.example.pokemonmarshmallow.di.component.DaggerAppComponent
import com.example.pokemonmarshmallow.di.module.NetworkModule

class BaseApp : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        this.appComponent = this.initDagger()
    }

    private fun initDagger() = DaggerAppComponent.builder()
//        .networkModule(NetworkModule())
//        .repositoryModule(RepositoryModule())
//        .pokemonUsecaseModule(PokemonUsecaseModule())
        .build()
}