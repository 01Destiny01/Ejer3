package com.example.ejer3

open class Motocicleta(
    numeroPlazas: Int,
    maletero: Boolean,
    marca: String,
    modelo: String,
    color: String
) :Vehiculo(marca , modelo , color)  {

    var numeroPlazas : Int = 0

        set(value) {
            field = if (value.equals(2)) 2 else value
        }
        get() {
            return field
        }
    var maletero : Boolean = false

        set(value) {
            field = value
        }
        get() {
            return field
        }
}