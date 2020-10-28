package _01_24

/*Escreva uma função que calcule o mdc de dois números fornecidos pelo usuário.*/

fun main() {

    print("Número 1: ")
    var numero1 = readLine()!!.toString().toDouble()

    print("Número 2: ")
    var numero2 = readLine()!!.toString().toDouble()

    println("\n\n\n resposta ....: "+mdc(numero1,numero2))

}


fun mdc(dividendo: Double, divisor: Double): Double {
    return if (dividendo % divisor == 0.0) {
        divisor
    } else {
        mdc(divisor, dividendo % divisor)
    }
}
