package com.example.homework7

import android.widget.ImageView
import com.bumptech.glide.Glide

object Extensions {
    fun ImageView.loadImaege(photo: String){
        Glide.with(this).load(photo).into(this)
    }
}