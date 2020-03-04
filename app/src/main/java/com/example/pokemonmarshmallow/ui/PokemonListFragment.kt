package com.example.pokemonmarshmallow.ui


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.example.pokemonmarshmallow.BaseApp
import com.example.pokemonmarshmallow.R
import com.example.pokemonmarshmallow.viewmodel.PokeMonListViewModel
import com.example.pokemonmarshmallow.viewmodel.ViewModelFactory
import javax.inject.Inject

class PokemonListFragment : BaseFragment() {

    private val pokemonDetailsFragment = PokemonDetailsFragment()

    private lateinit var pokeMonListViewModel: PokeMonListViewModel
    val pokadapter = PokemonListAdapter()

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (activity?.applicationContext as BaseApp).appComponent
            .newPokemonLisComponent().inject(this)

        pokeMonListViewModel = ViewModelProviders.of(this,viewModelFactory)[PokeMonListViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pokemon_list, container, false)
    }

    override fun getLayoutById(): Int {
        return R.layout.fragment_pokemon_list
    }


}
