package com.example.pokemonmarshmallow.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract  class BaseActivity : AppCompatActivity() {
    abstract  fun getLayoutById(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutById())
    }

    abstract fun initUI()
}