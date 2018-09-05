package com.irmabf.appofthrones

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button

class CharactersActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_characters)

        val button: Button = findViewById(R.id.button_character)

        button.setOnClickListener {
            //Log.d("Characters Activity", "Click is working")
            val intent: Intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
    }
}