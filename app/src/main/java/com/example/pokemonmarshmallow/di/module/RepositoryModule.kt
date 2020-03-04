package com.example.pokemonmarshmallow.di.module

import com.example.pokemonmarshmallow.di.scope.AppScope
import com.example.pokemonmarshmallow.network.PokemonApi
import com.example.pokemonmarshmallow.repository.PokemonRepository
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {
    @AppScope
    @Provides
    fun provideFeedRepository(api: PokemonApi) = PokemonRepository(api)
}