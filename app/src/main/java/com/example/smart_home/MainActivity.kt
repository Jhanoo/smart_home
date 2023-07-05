package com.example.smart_home

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.smart_home.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var view: View

    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        view = binding.root
        recyclerView = binding.recyclerView
        setContentView(view)


        var datas: ArrayList<ListData> = arrayListOf(
            ListData(1, "인터폰"),
            ListData(2, "침실1"),
            ListData(3, "침실2"),
            ListData(4, "에너지 소모 현황"),
            ListData(5, "외부 온도"),
            ListData(6, "실내 온도"),
            ListData(7, "세탁기"),
            ListData(8, "환풍기"),
        )

        var adapter = RecyclerAdapter(datas)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}