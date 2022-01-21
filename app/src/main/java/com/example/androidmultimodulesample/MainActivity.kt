package com.example.androidmultimodulesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.listRepo("usk2000")

        viewModel.repos.observe(this, { list ->
            list.forEach {
                Log.e("MainActivity", it.toString())
            }
        })

    }
}