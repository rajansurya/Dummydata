package com.papaer.gifview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.roger.gifloadinglibrary.GifLoadingView
import com.society.societygate.di.ViewModelFactory
import dagger.android.AndroidInjection
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    private var mRecyclerView: RecyclerView? = null
    @Inject
    lateinit var factory: ViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)
        val dashborad = ViewModelProviders.of(this, factory).get(MainActivityModel::class.java)
        dashborad.getGIF().observe(this, Observer {
            println( it.data!!.data[0].images.original.url)
            mRecyclerView?.adapter=HomeAdapter(this,it.data, GifLoadingView())
         })

        mRecyclerView =  findViewById(R.id.id_recyclerview)
        mRecyclerView?.layoutManager = GridLayoutManager(this,3)
       var div= SpacesItemDecoration(3)//DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL)
        mRecyclerView?.addItemDecoration(div)



    }


}
