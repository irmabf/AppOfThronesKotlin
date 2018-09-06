package com.irmabf.appofthrones

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import android.widget.Toast

class CharactersAdapter: RecyclerView.Adapter<CharactersAdapter.CharacterViewHolder> {

    constructor(): super(){
        itemClickListener = null
    }
    constructor(itemClickListener: ( (Character, Int) -> Unit) ): super(){
        this.itemClickListener = itemClickListener
    }
    val items = mutableListOf<Character>()

    //Lambda itemClickListener function
    private  val itemClickListener: ( (Character, Int) -> Unit)?

    //📌📌 We will call this setCharacters method inside onCreate, in the CharactersActivity
    fun setCharacters(characters: MutableList<Character>){
        items.clear()
        items.addAll(characters)
        //Adapter notificartion
        notifyDataSetChanged()
    }
    //A inner class is a nested class
    inner  class  CharacterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var character: Character? = null
        //When we set the characters value as an item we also set all the info inside the view
        //We do that with a custom setter
            set(value) {
                //Set the text of the textView
                itemView.findViewById<TextView>(R.id.label_name).text = value?.name
                //Set the field to the value that we are setting, !!remember field is a wildcard that kotlin setters provides us
                //and we CANNOT use another name
                field = value
            }
        init {
            itemView.setOnClickListener{
                character?.let {
                    itemClickListener?.invoke(character as Character, adapterPosition)
                }
            }
        }

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