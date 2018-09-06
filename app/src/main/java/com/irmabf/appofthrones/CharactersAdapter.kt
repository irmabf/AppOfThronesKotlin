package com.irmabf.appofthrones

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

class CharactersAdapter: RecyclerView.Adapter<CharactersAdapter.CharacterViewHolder>() {
    //A inner class is a nested class
    inner  class  CharacterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}