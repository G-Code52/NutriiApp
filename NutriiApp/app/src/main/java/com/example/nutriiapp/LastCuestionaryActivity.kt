package com.example.nutriiapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast

class LastCuestionaryActivity : AppCompatActivity(), View.OnClickListener {

    private var edtComidasDia: EditText? = null
    private var edtIntolerante: EditText? = null
    private var edtDisgusto: EditText? = null
    private var edtMonto: EditText? = null

    private var cbMenu1: RadioButton? = null
    private var cbMenu2: RadioButton? = null
    private var cbMenu3: RadioButton? = null

    private var btnContinuar6: Button? = null


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_cuestionary)

        edtComidasDia = findViewById(R.id.edtComidasDia)
        edtIntolerante = findViewById(R.id.edtIntolerante)
        edtDisgusto = findViewById(R.id.edtDisgusto)
        edtMonto = findViewById(R.id.edtMonto)

        cbMenu1 = findViewById(R.id.cbMenu1)
        cbMenu2 = findViewById(R.id.cbMenu2)
        cbMenu3 = findViewById(R.id.cbMenu3)

        btnContinuar6 = findViewById(R.id.btnContinuar6)
        btnContinuar6!!.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        Toast.makeText(this, "Datos Guardados", Toast.LENGTH_SHORT).show()

        val packageName = "com.example.nutriiapp"
        val className = "com.example.nutriiapp.MainMenuActivity"

        intent.setClassName(packageName, className)
        startActivity(intent)
    }
}