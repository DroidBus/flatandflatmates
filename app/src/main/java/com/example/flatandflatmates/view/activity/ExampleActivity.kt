package com.example.flatandflatmates.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.flatandflatmates.R
import com.example.flatandflatmates.view.fragment.ExampleFragment

class ExampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container,ExampleFragment())
            .commit()

    }
}