package com.example.appalumoscrud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.appalumoscrud.Entidades.Alumno
import com.example.appalumoscrud.databinding.ActivityNuevoAlumnoBinding

class NuevoAlumnoActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityNuevoAlumnoBinding

    var lista = ArrayList<Alumno>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       //
        binding = ActivityNuevoAlumnoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //

        binding.btnGrabar.setOnClickListener {
            //crear alumno nuevo
            var objAlu = Alumno(  binding.tilcodalu.text.toString().toInt(),
                binding.tilnomalu.text.toString(),
                binding.tilpension.text.toString().toDouble(),"computo e info"
        )
            // agregar
            lista.add(objAlu)
                //
                  Toast.makeText(applicationContext, "Alumno registrado correcto  - ${contador}",Toast.LENGTH_LONG).show()
            }
        }
    }
