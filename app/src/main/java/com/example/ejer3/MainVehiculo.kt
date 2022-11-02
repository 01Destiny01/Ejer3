package com.example.ejer3

var vehiculos: MutableList<Vehiculo> = mutableListOf(
    Motocicleta(
        2, true, "YAMAHA",
        "c6 ", "negro"
    ), Motocicleta(
        2, false, "BMW",
        "S1000RR ", "AZUL"
    ), Coche(
        2, 5, "TOYOTA",
        "CELICA GT ", "negro"
    ), Coche(
        2, 5, "BMW",
        "M5 ", "NEGRO MATE"
    )
)
fun main() {

    var pos: Int = 0

    while (pos < vehiculos.size) {

         if(vehiculos[pos] is Motocicleta) {
             println("MARCA: " + (vehiculos.get(pos) as Motocicleta).marca)
             println("MODELO: " + (vehiculos.get(pos) as Motocicleta).modelo)
             println("COLOR: " + (vehiculos.get(pos) as Motocicleta).color)
             println("NUMERO DE PLAZAS: " + (vehiculos.get(pos) as Motocicleta).numeroPlazas)
             println("MALETERO: " + (vehiculos.get(pos) as Motocicleta).maletero)
             println("\n")
         }



if (vehiculos[pos] is Coche) {
    println("MARCA: " + (vehiculos.get(pos) as Coche).marca)
    println("MODELO: " + (vehiculos.get(pos) as Coche).modelo)
    println("COLOR: " + (vehiculos.get(pos) as Coche).color)
    println("NUMERO DE PLAZAS: " + (vehiculos.get(pos) as Coche).numeroPlazasC)
    println("NUMERO DE   PUERTAS: " + (vehiculos.get(pos) as Coche).numeroPuertas)
    println("\n")
}





        pos++
    }


}




