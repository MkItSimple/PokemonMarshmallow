package com.example.pokemonmarshmallow.di.module

import androidx.lifecycle.ViewModelProvider
import com.example.pokemonmarshmallow.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

}