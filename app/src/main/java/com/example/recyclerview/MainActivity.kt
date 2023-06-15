package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter:RecyclerViewAdapter
    private var data=ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.recycler_view)

        recyclerView.layoutManager=LinearLayoutManager(this)

        data.add("0 Animesh Panda")
        data.add("1 Anisha Pati")
        data.add("2 Amarkishore Senapati")
        data.add("3 Arup Das")
        data.add("4 Ankita Sahoo")
        data.add("5 Arpan Praksh Sahu")
        data.add("6 Asish Kumar Sahu")
        data.add("7 Biswajit Biswal")
        data.add("8 Biren Kumar Sahu")
        data.add("9 Chinamya Kumar Jena")
        data.add("10 Chinamayee Sabar")
        data.add("11 Chandrakant Jena")
        data.add("12 Diptimayee Ojha")
        data.add("13 Dinesh Raut")
        data.add("14 Diptesh Chaudary")
        data.add("15 Ipsita Patnaik")
        data.add("16 Pariseema Rautray")
        data.add("17 Rajib Kumar Jena")
        data.add("18 Rakesh Pradhan")
        data.add("19 Snehal Prusti")
        data.add("20 Sumit Behera")
        data.add("21 Susmita Subudhi")
        data.add("22 Sidhant kumar Sahu")
        data.add("23 Sudheer Kumar Swain")
        data.add("24 Soumya Ranjan Sahoo")
        data.add("25 Soumya Ranjan jena")
        data.add("26 Basanta Bhola")
        data.add("27 Abhijit Gadnaik")
        adapter=RecyclerViewAdapter(data)
        recyclerView.adapter=adapter
    }
}