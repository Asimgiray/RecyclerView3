package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var rv: RecyclerView = findViewById(R.id.rvPerson)

        var person1 = Person("Merve", "Arpac", 21)
        var person2 = Person("Özgür", "Şen", 20)
        var person3 = Person("Şevval", "Özdamar", 19)


        var personAdapter: PersonAdapter = PersonAdapter(arrayListOf(person1, person2, person3))

        rv.adapter = personAdapter
        rv.layoutManager = LinearLayoutManager(this)



    }
}