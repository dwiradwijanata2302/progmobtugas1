package com.example.biodata

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnKlik = findViewById<Button>(R.id.btnKlik)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val txtHello = findViewById<TextView>(R.id.txtHello)
        val txtDataDiri = findViewById<TextView>(R.id.txtDataDiri)

        btnKlik.setOnClickListener {
            txtHello.text = "Biodata Mahasiswa"

            val biodata = """
                Nama  : I Made Dwira Dwijanata
                NIM   : 2405551051
                Kelas : Pemrograman Mobile A
            """.trimIndent()

            txtDataDiri.text = biodata
            txtDataDiri.visibility = View.VISIBLE
            btnReset.visibility = View.VISIBLE
            btnKlik.visibility = View.GONE
        }

        btnReset.setOnClickListener {
            txtDataDiri.visibility = View.GONE
            btnReset.visibility = View.GONE
            txtHello.text = "Hello World!"
            btnKlik.visibility = View.VISIBLE
        }
    }
}
