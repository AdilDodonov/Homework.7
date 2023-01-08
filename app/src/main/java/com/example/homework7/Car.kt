package com.example.homework7

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Car(
    val name: String,
    val age: Int,
    val photo: String
    ):  Parcelable
