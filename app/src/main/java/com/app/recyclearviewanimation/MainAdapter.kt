package com.app.recyclearviewanimation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.recyclearviewanimation.databinding.ItemSearchJobBinding

class MainAdapter() : RecyclerView.Adapter<MainAdapter.AdapterViewHolder> (){


    inner class AdapterViewHolder(itemview:View) : RecyclerView.ViewHolder(itemview)
    {
        var binding = ItemSearchJobBinding.bind(itemview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder {
        return AdapterViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_search_job,parent,false)
        )

    }

    override fun getItemCount(): Int {
        return 13

    }

    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {

        var data = position

    }
}