package com.elena.neoland_elena

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay

class RegisteredUserViewModel(application: Application): AndroidViewModel(application) {
    private var myself = Student("", "Yo", "barbullushi", R.mipmap.ic_launcher)

    suspend fun getListaAlumnos(): List<Student>{
        delay(2000)
        val estudiante1 = Student("oliver@gmail.com", "Oliver", "Sanchez", R.mipmap.avatar_1)
        val estudiante2 = Student("ana@gmail.com", "Ana", "Lopez", R.mipmap.avatar_11)
        val estudiante3 = Student("isabel@gmail.com", "Isabel", "Blanco", R.mipmap.avatar_17)
        val estudiante4 = Student("dana@gmail.com", "Dana", "Negro", R.mipmap.avatar_5)
        val estudiante5 = Student("jose@gmail.com", "Jose", "Garcia", R.mipmap.avatar_7)
        return mutableListOf(myself, estudiante1,estudiante2,estudiante3,estudiante4,estudiante5)
    }
    fun setMyselfEmail(email: String) {
        myself.email = email
    }
}