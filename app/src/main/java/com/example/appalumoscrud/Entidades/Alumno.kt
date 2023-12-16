package com.example.appalumoscrud.Entidades

class Alumno(xcod:Int, xnod:String, xpension:Double, xcar:String ) {
    //definimos las varuialbes de la clase
    var codalu: Int = 0
    var nomalu: String = ""
    var pension: Double = 0.0
    var carrera: String=""

    //iniciacion las cvarialbes de la clse (campo)
    init {
        codalu = xcod
        nomalu = xnod
        pension = xpension
        carrera = xcar
    }
}