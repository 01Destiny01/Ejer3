package com.example.ejer3

open class Vehiculo(marca : String, modelo : String, color : String) {




    var marca: String = ""
        set(value) {
            field = if (value.isEmpty()) "empty" else value
        }
        get() {
            return field
        }

    var modelo: String = ""
        set(value) {
            field = if (value.isEmpty()) "empty" else value
        }
        get() {
            return field
        }

    var color: String = ""
        set(value) {
            field = if (value.isEmpty()) "empty" else value
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
