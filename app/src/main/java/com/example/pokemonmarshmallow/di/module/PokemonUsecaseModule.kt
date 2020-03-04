package com.example.pokemonmarshmallow.di.module

import com.example.pokemonmarshmallow.di.scope.AppScope
import com.example.pokemonmarshmallow.domain.PokemonUsecase
import com.example.pokemonmarshmallow.repository.PokemonRepository
import dagger.Module
import dagger.Provides

@Module
class PokemonUsecaseModule {
    @AppScope
    @Provides
    fun provideFeedUseCase(repository : PokemonRepository) = PokemonUsecase(repository)
}