package com.irmabf.appofthrones

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class CharactersAdapter: RecyclerView.Adapter<CharactersAdapter.CharacterViewHolder>() {

    val items = mutableListOf<Character>()
    //A inner class is a nested class
    inner  class  CharacterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var character: Character? = null
    }
    //We can access to a context from any class that inherits from View, this inner class inherits from View,
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        //inflate(xml layout, root - where do we want to put that view, attachToRoot)
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_character, parent, false)
        return CharacterViewHolder(view)
    }
    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        //item[position] gets the individual items from the items list and we save that item to the item variable
        //similar to let item = indexpath[row] in iOS
        val item = items[position]
        //set the the character as an item
        holder.character = item
    }
    override fun getItemCount(): Int {
        return  items.size
    }
}