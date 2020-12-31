package com.papaer.gifview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.roger.gifloadinglibrary.GifLoadingView
import model.Alldata
import model.Image


public class HomeAdapter(var context:Context,var alldata: Alldata,var  mGifLoadingView: GifLoadingView): RecyclerView.Adapter<HomeAdapter.MyViewHolder>() {
     class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var ImageButton: ImageView

        init {
            ImageButton = view.findViewById(R.id.mButton) as ImageView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false))
    }

    override fun getItemCount(): Int {
        return alldata.data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        holder.ImageButton.setText(alldata.data.get(position).origin.image.toString())
        Glide.with(context)
            .load(alldata.data.get(position).images.original.url)
//            .apply(requestOptions)
//            .thumbnail(Glide.with(context).load(imageUrl))
            .into(holder.ImageButton)
        holder.ImageButton.setOnClickListener {
           var intent= Intent(context,FullView::class.java)
            intent.putExtra("urlimg",alldata.data.get(position).images.original.url)
            context.startActivity(intent)
        }
    }
}