package com.elena.neoland_elena

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.elena.neoland_elena.databinding.ActivityPerfilBinding
import kotlinx.coroutines.launch

class ProfileActivity : AppCompatActivity() {
   lateinit var binding: ActivityPerfilBinding
    private  var adapter = StudentAdapter()
    private lateinit var model :RegisteredUserViewModel

    companion object {
        const val VALUE_1 = "VALUE_1"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityPerfilBinding.inflate(layoutInflater)
        setContentView(binding.root)
        model = ViewModelProvider(this).get(RegisteredUserViewModel::class.java)

        val email = intent.getStringExtra(VALUE_1)
        email?.let {
            model.setMyselfEmail(email)
        }

        createRecyclerView()
    }

    private fun createRecyclerView() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
        lifecycleScope.launch{
            adapter.updateData(model.getListaAlumnos())
        }
    }


}