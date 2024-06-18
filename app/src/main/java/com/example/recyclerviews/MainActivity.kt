package com.example.recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val names = listOf("Anna", "Brenda", "caro", "Diana", "Edna", "Gladys", "Hellen", "Ivy",
            "Janet", "Karen", "Lilian", "Penny", "AShley", "Precious", "Nelly","Anna", "Brenda",
            "caro", "Diana", "Edna", "Gladys", "Hellen", "Ivy", "Eshe", "Kame", "Susan", "Henriette",
            "Janet", "Karen", "Lilian", "Penny", "AShley", "Precious", "Nelly", "Anna", "Brenda",
            "caro", "Diana", "Edna", "Gladys", "Hellen", "Ivy", "Anna", "Brenda", "caro", "Diana",
            "Janet", "Karen", "Lilian", "Penny", "AShley", "Precious", "Nelly", "Edna", "Gladys",
            "Hellen", "Ivy", "Janet", "Karen", "Lilian", "Penny", "AShley", "Precious", "Nelly",
            "Anna", "Brenda", "caro", "Diana", "Edna", "Gladys", "Hellen", "Ivy", "Adhiambo", "Raul",
            "Janet", "Karen", "Lilian", "Penny", "AShley", "Precious", "Nelly","Anna", "Brenda",
            "caro", "Diana", "Edna", "Gladys", "Hellen", "Ivy", "Eshe", "Kame", "Susan", "Henriette",
            "Janet", "Karen", "Lilian", "Penny", "AShley", "Precious", "Nelly", "Anna", "Brenda",
            "caro", "Diana", "Edna", "Gladys", "Hellen", "Ivy", "Anna", "Brenda", "caro", "Diana",
            "Janet", "Karen", "Lilian", "Penny", "AShley", "Precious", "Nelly", "Edna", "Gladys",
            "Hellen", "Ivy", "Janet", "Karen", "Lilian", "Penny", "AShley", "Precious", "Nelly",
            "Faith", "Munyau",)

        binding.rvnames.layoutManager = LinearLayoutManager(this)
        val namesAdapter = NamesRecyclerViewAdapter(names)
        binding.rvnames.adapter = namesAdapter
    }
}