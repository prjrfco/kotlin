package _01_24
/*Crie um aplicativo que receba uma temperatura qualquer em Farenheit e apresente seu correspondente
em Celsius por meio de um método. Para o cálculo utilize a seguinte fórmula: Celsius = 5.0/9.0*(f-32)*/

fun main() {
    print("Temperatura Farenheit: ")

    val doubleInput = readLine()!!.toString().toDoubleOrNull()

    println("Conversão para celsius: " + conversorTemp(doubleInput))
}

fun conversorTemp(tempF: Double? = null): Double? {
    if (tempF != null) {
        return 5.0/9.0*(tempF-32)
    }
    return null
}

