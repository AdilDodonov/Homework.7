package com.example.homework7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework7.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {

    lateinit var binding: ActivityFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getIntentData()
    }

    private fun getIntentData() {
        val car = intent.getParcelableExtra<Car>("k")

        val bundle = Bundle()
        bundle.putParcelable("k", car)

        val blankFragment = BlankFragment()
        blankFragment.arguments = bundle
        supportFragmentManager.beginTransaction().add(R.id.fragment_container_view, blankFragment)
            .commit()
    }
}