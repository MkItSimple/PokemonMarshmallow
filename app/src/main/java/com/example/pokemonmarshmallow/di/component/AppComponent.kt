package com.example.pokemonmarshmallow.di.component

import com.example.pokemonmarshmallow.di.module.*
import com.example.pokemonmarshmallow.di.scope.AppScope
import com.example.pokemonmarshmallow.di.subcomponent.PokemonDetailsComponent
import com.example.pokemonmarshmallow.di.subcomponent.PokemonListComponent
import dagger.Component

@AppScope
@Component(
    modules = [
        NetworkModule::class,
        PokemonUsecaseModule::class,
        RepositoryModule::class
    ]
)
interface AppComponent {
    fun newPokemonLisComponent(): PokemonListComponent
    fun newPokemonDetailsComponent(): PokemonDetailsComponent
}