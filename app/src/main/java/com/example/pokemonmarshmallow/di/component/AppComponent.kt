package com.example.pokemonmarshmallow.di.component

import com.example.pokemonmarshmallow.di.module.NetworkModule
import com.example.pokemonmarshmallow.di.scope.AppScope
import dagger.Component

@AppScope
@Component(
    modules = [
        NetworkModule::class
//        PokemonUsecaseModule::class,
//        RepositoryModule::class
    ]
)
interface AppComponent {
//    fun newPokemonLisComponent(): PokemonListComponent
//    fun newPokemonDetailsComponent(): PokemonDetailsComponent
}