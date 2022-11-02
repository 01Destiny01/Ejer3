package com.example.ejer3

open class Coche(numeroPuertas : Int , numeroPlazasC : Int, marca:String, modelo :String, color:String) : Vehiculo(marca, modelo, color ) {

    var numeroPlazasC : Int = 0

        set(value) {
            field = if (value.equals(2)) 2  else value
        }
        get() {
            return field
        }

    var numeroPuertas : Int = 0
        set(value) {
            field =  if (value.equals(2)) 2 else value
        }
        get() {
            return field
        }



    init {
        this.marca = marca
        this.modelo = modelo
        this.color = color
    }

}