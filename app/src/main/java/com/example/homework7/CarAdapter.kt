package com.example.homework7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework7.Extensions.loadImaege
import com.example.homework7.databinding.ItemCarBinding

class CarAdapter(var arrayList: ArrayList<Car>, var onClicK: (Car) -> Unit) :
    RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

    inner class CarViewHolder(var binding: ItemCarBinding) : RecyclerView.ViewHolder(binding.root) {


        fun onBind(car: Car) {
            binding.imageView.loadImaege(car.photo)
            binding.textView.text = car.name
            binding.textView2.text = car.age.toString()
            binding.imageView.setOnClickListener {
                onClicK(car)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        return CarViewHolder(
            ItemCarBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.onBind(arrayList[holder.adapterPosition])
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}