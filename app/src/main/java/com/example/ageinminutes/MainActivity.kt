package com.example.ageinminutes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.app.DatePickerDialog
import android.widget.DatePicker
import android.widget.TextView
import android.widget.Toast.*
import androidx.core.view.get
import com.example.ageinminutes.databinding.ActivityMainBinding
//import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import android.widget.Button as WidgetButton


/**
 * This is my main activity
 */

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    var cal = Calendar.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        binding.btnDatePicker.setOnClickListener()

        binding.selectedDate.text = "Hello"

        setContentView(binding.root)




    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}

private fun View.setOnClickListener() {
    TODO("Not yet implemented")
}
