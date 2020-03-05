package com.example.pokemonmarshmallow.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pokemonmarshmallow.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
    }

    fun initUI() {
        supportFragmentManager.beginTransaction().add(R.id.container, PokemonListFragment()).commit()
    }
}
