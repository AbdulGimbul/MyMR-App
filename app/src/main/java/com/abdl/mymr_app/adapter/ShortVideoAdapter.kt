package com.abdl.mymr_app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abdl.mymr_app.ShortVideos
import com.abdl.mymr_app.databinding.ItemShortVideoBinding
import com.bumptech.glide.Glide

class ListShortVideoAdapter(private val listSV: ArrayList<ShortVideos>) : RecyclerView.Adapter<ListShortVideoAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemShortVideoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (picture) = listSV[position]

        Glide.with(holder.binding.root)
            .load(picture)
            .into(holder.binding.shortVideo)

    }

    override fun getItemCount(): Int {
        return listSV.size
    }

    class ListViewHolder(var binding: ItemShortVideoBinding) : RecyclerView.ViewHolder(binding.root)
}