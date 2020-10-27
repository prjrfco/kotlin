package _01_24
/*Faça uma função que possibilite o arredondamento de um número real para um número inteiro
seguindo os padrões científicos.*/


fun main() {

    print("Numero: ")
    var numero = readLine()!!.toString().toDouble()

    print("Arredondado: " + arredondar(numero))
}

fun arredondar(numero: Double): Double {

    return Math.round(numero).toDouble()
}
