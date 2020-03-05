package com.example.pokemonmarshmallow.ui

import android.app.Dialog
import com.example.pokemonmarshmallow.R

class MainActivity : BaseActivity() {

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }


   override fun getLayoutById() = R.layout.activity_main
    private val pokemonListFragment = PokemonListFragment()

    override fun initUI() {
        supportFragmentManager.beginTransaction().add(R.id.container, pokemonListFragment).commit()
    }
}
