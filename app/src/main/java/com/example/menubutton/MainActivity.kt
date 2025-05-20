package com.example.menubutton

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.navigation_bar_layout)

        val navigationView = findViewById<BottomNavigationView>(R.id.bottom_nav)
        navigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_home -> {
                    Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.action_favorite -> {
                    Toast.makeText(this, "Favorite", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.action_my_page -> {
                    Toast.makeText(this, "My Page", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }
}
