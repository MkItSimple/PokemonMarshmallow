package com.example.pokemonmarshmallow.di.subcomponent

import com.example.pokemonmarshmallow.di.module.PokemonDetailsViewModelModule
import com.example.pokemonmarshmallow.di.module.ViewModelFactoryModule
import com.example.pokemonmarshmallow.di.scope.FragmentScope
import com.example.pokemonmarshmallow.ui.PokemonDetailsFragment
import dagger.Subcomponent

@FragmentScope
@Subcomponent(
    modules = [
        ViewModelFactoryModule::class,
        PokemonDetailsViewModelModule::class
    ]
)
interface PokemonDetailsComponent {
    fun inject(pokemonDetailsFragment: PokemonDetailsFragment)
}