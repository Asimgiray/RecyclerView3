package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonAdapter(
    val personList: ArrayList<Person>
) : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var txtName: TextView? = null
        var txtSurname: TextView? = null
        var txtAge: TextView? = null
        var imgPerson: ImageView? = null

        init {
            txtName = itemView.findViewById(R.id.txtName)
            txtSurname = itemView.findViewById(R.id.txtSurname)
            txtAge = itemView.findViewById(R.id.txtAge)
            imgPerson = itemView.findViewById(R.id.imgPerson)
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {

        //First version
        /*val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.row_person_item, parent, false)
        return PersonViewHolder(view)*/

        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.row_person_item, parent, false)
        return PersonViewHolder(view)

    }

    override fun getItemCount(): Int = personList.size

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {

        val currentPerson: Person = personList[position]
        holder.txtName?.text = currentPerson.name
        holder.txtSurname?.text = currentPerson.surname
        holder.txtAge?.text = currentPerson.age.toString()

    }


}