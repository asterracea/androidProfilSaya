package com.example.minggu8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.minggu8.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.txtName = "alip"

        val button: Button = findViewById(R.id.btnNama)
        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        Toast.makeText(applicationContext,"Alieffiea Widya Prawita",
            Toast.LENGTH_SHORT).show()
    }
}