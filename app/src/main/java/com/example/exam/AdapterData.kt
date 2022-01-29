package com.example.exam

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exam.databinding.PesonListBinding

class Adapter(): RecyclerView.Adapter<Adapter.PersonViewHolder>() {
    private var personList = DataHolder.getPersons()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = PesonListBinding.inflate(inflater, parent, false)
        return PersonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val person = personList[position]

        with(holder.binding) {
            avatar.setImageResource(person.pictureRes)
            name.text = person.name
            surname.text = person.surname
            description.text = person.minimalInfo
        }
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    class PersonViewHolder(var binding: PesonListBinding): RecyclerView.ViewHolder(binding.root)
}