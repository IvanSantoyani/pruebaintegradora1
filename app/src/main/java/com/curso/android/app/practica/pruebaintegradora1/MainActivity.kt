package com.curso.android.app.practica.pruebaintegradora1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.curso.android.app.practica.pruebaintegradora1.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val compareButton = findViewById<Button>(R.id.compareButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        compareButton.setOnClickListener {
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()
            viewModel.compareTexts(text1, text2)
        }

        viewModel.result.observe(this, { result ->
            resultTextView.text = result
        })
    }}