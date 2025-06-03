package com.omergezici.turktelekom.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.omergezici.turktelekom.databinding.CardDesignUsageDetailsBinding

class UsageDetailsAdapter(var context: Context,var usageDetailList:List<Package>):RecyclerView.Adapter<UsageDetailsAdapter.CardDesignHolder>() {
    inner class CardDesignHolder(var design:CardDesignUsageDetailsBinding):RecyclerView.ViewHolder(design.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
       val design=CardDesignUsageDetailsBinding.inflate(LayoutInflater.from(context),parent,false)
        return CardDesignHolder(design)
    }
    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
      val yemek=usageDetailList.get(position)
        var t=holder.design

    }


    override fun getItemCount(): Int {
       return usageDetailList.size
    }


}