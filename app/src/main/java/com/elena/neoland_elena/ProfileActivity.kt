package com.elena.neoland_elena

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.elena.neoland_elena.databinding.ActivityPerfilBinding

class ProfileActivity : AppCompatActivity() {
   private lateinit var binding: ActivityPerfilBinding
    private lateinit var adapter : StudentsAdapter
    companion object {
        const val VALUE_1 = "VALUE_1"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityPerfilBinding.inflate(layoutInflater)
        setContentView(binding.root)
        createRecyclerView()




    }
    private fun createRecyclerView() {
        adapter = StudentsAdapter(getListaAlumnos())
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }
    private fun getListaAlumnos(): List<Student>{
        val estudiante1 = Student("oliver@gmail.com", "Oliver", "Sanchez", R.mipmap.avatar_1)
        val estudiante2 = Student("ana@gmail.com", "Ana", "Lopez", R.mipmap.avatar_11)
        val estudiante3 = Student("isabel@gmail.com", "Isabel", "Blanco", R.mipmap.avatar_17)
        val estudiante4 = Student("dana@gmail.com", "Dana", "Negro", R.mipmap.avatar_5)
        val estudiante5 = Student("jose@gmail.com", "Jose", "Garcia", R.mipmap.avatar_7)
        return mutableListOf(estudiante1,estudiante2,estudiante3,estudiante4,estudiante5).apply { shuffle()}
    }

}