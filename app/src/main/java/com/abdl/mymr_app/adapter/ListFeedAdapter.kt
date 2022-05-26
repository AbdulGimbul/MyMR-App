package com.abdl.mymr_app.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abdl.mymr_app.Feed
import com.abdl.mymr_app.databinding.ItemFeedBinding
import com.bumptech.glide.Glide

class ListFeedAdapter(private val listFeed: ArrayList<Feed>) : RecyclerView.Adapter<ListFeedAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemFeedBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, story, picture) = listFeed[position]
        holder.binding.tvItemName.text = name
        holder.binding.tvItemStory.text = story
        Glide.with(holder.binding.root)
            .load(picture)
            .into(holder.binding.pictureFeed)
            
    }

    override fun getItemCount(): Int {
        return listFeed.size
    }

    class ListViewHolder(var binding: ItemFeedBinding) : RecyclerView.ViewHolder(binding.root)
}