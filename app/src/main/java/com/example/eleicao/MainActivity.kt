package com.example.eleicao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConfirmar.setOnClickListener{
            Toast.makeText(
                this,
                "Olá ${nome.text.toString()}",
                Toast.LENGTH_LONG
            ).show()

            var intt = Intent(this, page2::class.java)
            startActivity(intt)
        }


    }
}
