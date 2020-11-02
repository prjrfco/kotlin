package _01_24

import kotlin.math.pow

/* Crie um aplicativo que receba o raio de uma esfera (do tipo double) e chame o método volumeEsfera
para calcular e exibir o volume da esfera na tela. Para cálculo do volume deve ser usada a fórmula:
volume = (4.0/3.0)*pi*raio 2 .*/


fun main() {
    print("Raio da esfera: ")

    val doubleInput = readLine()!!.toString().toDoubleOrNull()

    println("Volume da esfera: " + volumeEsfera(doubleInput))
}

fun volumeEsfera(raio: Double? = null): Double? {
    if(raio != null){
        val pi: Double = 3.14159
        return (4.0 / 3.0) * pi * raio.pow(2)
    }
    return null
}
