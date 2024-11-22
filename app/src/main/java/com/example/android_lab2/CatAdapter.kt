package com.example.android_lab2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CatAdapter : RecyclerView.Adapter<CatAdapter.ViewHolder>() {
    val cats = listOf(
        Cat(
            image = R.drawable.cat_1, name = R.string.cat_1
        ), Cat(
            image = R.drawable.cat_2, name = R.string.cat_2
        ), Cat(
            image = R.drawable.cat_3, name = R.string.cat_3
        ), Cat(
            image = R.drawable.cat_4, name = R.string.cat_4
        ), Cat(
            image = R.drawable.cat_5, name = R.string.cat_5
        ), Cat(
            image = R.drawable.cat_6, name = R.string.cat_6
        ), Cat(
            image = R.drawable.cat_7, name = R.string.cat_7
        ), Cat(
            image = R.drawable.cat_8, name = R.string.cat_8
        ), Cat(
            image = R.drawable.cat_9, name = R.string.cat_9
        )
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cat, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(cats[position].image)
        holder.textView.setText(cats[position].name)
    }

    override fun getItemCount() = cats.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageView)
        val textView: TextView = view.findViewById(R.id.textView)
    }
}