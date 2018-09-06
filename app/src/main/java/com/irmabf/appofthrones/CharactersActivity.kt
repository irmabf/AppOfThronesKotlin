package com.irmabf.appofthrones

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.Button
import com.irmabf.appofthrones.CharactersRepo.characters

class CharactersActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_characters)

        //Instantiate our custom adapter CharactersAdapted needed for the RecyclerView
        val adapter: CharactersAdapter = CharactersAdapter() { item, position ->
                //What happens if  the item is clicked

            showDetails()
        }
        //Call the adapter setCharacters property
        adapter.setCharacters(characters)

        val list: RecyclerView = findViewById(R.id.list)
        list.layoutManager = LinearLayoutManager(this)
        //Set the list adapter to adapter
        list.adapter = adapter
    }
    fun showDetails() {
        val intent: Intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }
}