package com.papaer.gifview

import android.app.Activity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class FullView : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.full_view)
        var imge=findViewById<ImageView>(R.id.full_img)
        var urlimg=intent.getStringExtra("urlimg")
        Glide.with(this)
            .load(urlimg)
//            .apply(requestOptions)
//            .thumbnail(Glide.with(context).load(imageUrl))
            .into(imge)
    }
}