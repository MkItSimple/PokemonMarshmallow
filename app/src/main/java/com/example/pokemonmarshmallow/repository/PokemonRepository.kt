package com.example.pokemonmarshmallow.repository

import com.example.pokemonmarshmallow.LIMIT
import com.example.pokemonmarshmallow.data.PokemonDetails
import com.example.pokemonmarshmallow.data.PokemonResponse
import com.example.pokemonmarshmallow.network.PokemonApi
import io.reactivex.Observable

class PokemonRepository (val pokemonApi: PokemonApi){

    fun getPokemonList(offset:Int): Observable<PokemonResponse> {
        return  pokemonApi.getPokemonList(offset , LIMIT)
    }

    fun getPokemonDetails(id:Int):Observable<PokemonDetails>{
        return pokemonApi.getPokemonDetails(id)
    }

}