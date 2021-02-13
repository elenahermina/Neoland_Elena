package com.elena.neoland_elena

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import com.elena.neoland_elena.databinding.ActivityMainBinding
import com.elena.neoland_elena.databinding.ActivityPerfilBinding

class ProfileActivity : AppCompatActivity() {
    lateinit var binding: ActivityPerfilBinding

    companion object {
        const val VALUE_1 = "VALUE_1"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityPerfilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(VALUE_1)
        binding.textView2.text = name
    }

}