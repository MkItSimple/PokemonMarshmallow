package com.example.pokemonmarshmallow.ui


import android.content.Context
import android.os.Bundle
import android.view.View
import com.example.pokemonmarshmallow.BaseApp
import com.example.pokemonmarshmallow.R
import com.example.pokemonmarshmallow.viewmodel.PokemonDetailsViewModel
import com.example.pokemonmarshmallow.viewmodel.ViewModelFactory
import javax.inject.Inject


class PokemonDetailsFragment : BaseFragment() {
    private lateinit var pokemonDetailsViewModel: PokemonDetailsViewModel
    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (activity?.applicationContext as BaseApp).appComponent
            .newPokemonDetailsComponent().inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val id = arguments?.getInt(POKEMON_DETAILS_KEY)
//        id?.let { getPokemonDetails(it) }
    }


//    fun getPokemonDetails(id: Int) {
//        if (isVisible) {
//            pokemonDetailsViewModel.getPokemonDetails(id)
//            observePokemonDetails()
//        }
//
//    }
//
//    fun observePokemonDetails() {
//        pokemonDetailsViewModel.getLivePokemonDetails().observe(this, Observer {
////            setData(it)
//        })
//    }
//
////    fun setData(response: PokemonDetails?) {
////        Picasso.get().load(response?.sprites?.front_default).into(pokemonImage)
////        pokemonWeight.text = "Weight is :".plus(response?.weight.toString())
////        pokemonHeight.text = "Height is :".plus(response?.height.toString())
////    }
//
    override fun getLayoutById() = R.layout.fragment_pokemon_details

}
