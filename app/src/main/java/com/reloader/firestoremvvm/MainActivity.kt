package com.reloader.firestoremvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = MainAdapter(this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        val dummyList = mutableListOf<Usuario>()
        dummyList.add(Usuario("https://www.academiamoviles.com/view/logos_cursos/android-con-kotlin.png",
            "Reloader","ViewModelKt"))

        adapter.setListData(dummyList)
        adapter.notifyDataSetChanged()

    }
}
