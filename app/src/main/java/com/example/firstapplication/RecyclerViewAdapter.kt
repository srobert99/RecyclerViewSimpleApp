package com.example.firstapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.cardview_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val curAffirmation = dataset.get(position)
        holder.itemView.apply {
            findViewById<TextView>(R.id.affirmationTV).setText(curAffirmation.stringResourceId)
            findViewById<ImageView>(R.id.landscapeIV).setImageResource(curAffirmation.drawableResourceId)
            findViewById<ImageView>(R.id.landscapeIV).setOnClickListener {
                Toast.makeText(
                    context,
                    curAffirmation.stringResourceId,
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}

