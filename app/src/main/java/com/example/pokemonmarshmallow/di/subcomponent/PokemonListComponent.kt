package com.example.pokemonmarshmallow.di.subcomponent

import com.example.pokemonmarshmallow.di.module.PokemonListViewModelModule
import com.example.pokemonmarshmallow.di.module.ViewModelFactoryModule
import com.example.pokemonmarshmallow.di.scope.FragmentScope
import com.example.pokemonmarshmallow.ui.PokemonListFragment
import dagger.Subcomponent

@FragmentScope
@Subcomponent(
    modules = [
        ViewModelFactoryModule::class,
        PokemonListViewModelModule::class
    ]
)
interface PokemonListComponent {
    fun inject(pokemonListFragment: PokemonListFragment)
}