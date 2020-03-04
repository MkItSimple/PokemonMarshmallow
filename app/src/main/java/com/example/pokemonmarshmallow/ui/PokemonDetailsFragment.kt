package com.example.pokemonmarshmallow.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.pokemonmarshmallow.R
import com.example.pokemonmarshmallow.viewmodel.PokemonDetailsViewModel
import com.example.pokemonmarshmallow.viewmodel.ViewModelFactory
import javax.inject.Inject


class PokemonDetailsFragment : BaseFragment() {
    private lateinit var pokemonDetailsViewModel: PokemonDetailsViewModel
    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pokemon_details, container, false)
    }

    override fun getLayoutById() = R.layout.fragment_pokemon_details

}
