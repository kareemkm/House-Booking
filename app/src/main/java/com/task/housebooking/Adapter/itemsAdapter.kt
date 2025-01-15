package com.task.housebooking.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.task.housebooking.Activity.DetailsActivity
import com.task.housebooking.Model.ItemsDomain
import com.task.housebooking.databinding.ViewHolderItemBinding

class ItemsAdapter(private val itemsDomain: List<ItemsDomain>): RecyclerView.Adapter<ItemsAdapter.ViewHolder>() {

    private lateinit var context: Context

    class ViewHolder(val binding: ViewHolderItemBinding): RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsAdapter.ViewHolder {
        val binding = ViewHolderItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        context = parent.context
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemsAdapter.ViewHolder, position: Int) {
        val items = itemsDomain[position]
        with(holder.binding){
            titleTxt.text = items.title
            priceTxt.text = "$ ${items.price}"
            bedTxt.text = items.bed.toString()
            bathTxt.text = items.bath.toString()

            val drawableRecouseId = holder.itemView.resources.getIdentifier(
                items.pickPath,"drawable",holder.itemView.context.packageName
            )

            Glide.with(context)
                .load(drawableRecouseId)
                .into(pic)

            holder.itemView.setOnClickListener {
                val intent = Intent(context,DetailsActivity::class.java)
                intent.putExtra("object",items)
                context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int = itemsDomain.size

}