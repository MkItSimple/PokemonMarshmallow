package com.example.pokemonmarshmallow.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pokemonmarshmallow.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    private val pokemonListFragment = PokemonListFragment()
//
//    override fun initUI() {
//        //  viewModel = ViewModelProviders.of(this, viewModelFactory)[PokeMonListViewModel::class.java]
//        supportFragmentManager.beginTransaction().add(R.id.container, pokemonListFragment).commit()
//    }
}
