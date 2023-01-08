package com.example.homework7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private var arrayList: ArrayList<Car>? = null
    lateinit var adapter: CarAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadDate()
        setAdapter()
    }


    private fun loadDate() {
        arrayList = ArrayList()
        arrayList?.add(Car("Audi", 3, "https://i0.wp.com/electrek.co/wp-content/uploads/sites/3/2022/09/4472-AudiPB18e-tronconceptcar-e1663011000365.jpg?w=1500&quality=82&strip=all&ssl=1"))
        arrayList?.add(Car("BMW", 1, "https://www.topgear.com/sites/default/files/2022/12/MANHART-MH4-GTR-II-G82-Website-1.jpg?w=892&h=502"))
        arrayList?.add(Car("Audi", 3, "https://gta5-game.com/uploads/posts/2017-02/medium/1487206892_mercedes-benz-amg-gt-r-2017-shikarnyy-mers.jpg"))
        arrayList?.add(Car("Audi", 3, "https://img-optimize.toyota-europe.com/resize/ccis/680x680/zip/ru/product-token/3099f46c-10be-4228-be4f-35a011e2601d/vehicle/5ea60a27-739e-4ee1-9650-f1318c54e66e/image-quality/70/day-exterior-4_040.png"))
        arrayList?.add(Car("Audi", 3, "https://motor.ru/thumb/908x0/filters:quality(75):no_upscale()/imgs/2022/07/01/13/5475820/9fd774ad17f3f185d68575e5ff326121d1f0261a.jpg"))

    }

    private fun setAdapter() {
        if (arrayList != null) {
            adapter = CarAdapter(arrayList!!) {
                var intent = Intent(this, FragmentActivity::class.java)
                intent.putExtra("k", it)
                startActivity(intent)
            }
            binding.recycleViewCar.adapter = adapter
        }
    }
}