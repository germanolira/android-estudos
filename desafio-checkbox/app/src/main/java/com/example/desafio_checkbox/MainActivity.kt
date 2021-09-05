package com.example.desafio_checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkbox.setOnClickListener {
            if (checkbox.isChecked) {
                imageAndroid.setColorFilter(resources.getColor(R.color.teal_200))
            } else {
                imageAndroid.setColorFilter(resources.getColor(R.color.black))
            }
        }
    }
}