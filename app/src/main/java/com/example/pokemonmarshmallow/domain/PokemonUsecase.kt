package com.example.pokemonmarshmallow.domain

import com.example.pokemonmarshmallow.repository.PokemonRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class PokemonUsecase(private val repository: PokemonRepository) {

    fun getPokemonList(offset: Int) = repository.getPokemonList(offset)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())

    fun getPokemonDetails(id: Int) = repository.getPokemonDetails(id)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())

}