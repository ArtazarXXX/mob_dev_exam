package com.example.exam

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.*
import com.example.exam.databinding.ActivityMainBinding

interface ActivityFunctions {
    fun cardEvent(e: String)
}

class MainActivity : AppCompatActivity() {

    private val verticalLinearLayoutManager: LinearLayoutManager =
        LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val layoutManager = LinearLayoutManager(this)
        binding.apply {
            recyclerView.layoutManager = verticalLinearLayoutManager
            recyclerView.adapter = Adapter()
        }
    }
}