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

    val list: RecyclerView by lazy {
        val list: RecyclerView = findViewById(R.id.list)
        list.layoutManager = LinearLayoutManager(this)
        //this code returns the list as lazy initializers don´t use returns
        list
    }

    val adapter: CharactersAdapter by lazy {
        val adapter = CharactersAdapter { item, position ->
            //What happens if  the item is clicked
            showDetails()
        }
        adapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_characters)
        //Get the characters
        val characters: MutableList<Character> = CharactersRepo.characters
        //Call the adapter setCharacters property, this set the characters to the adapter
        adapter.setCharacters(characters)
        //Now we set the adapter with the characters to the list
        list.adapter = adapter
    }
    fun showDetails() {
        val intent: Intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }
}