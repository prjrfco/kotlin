package _01_24

import java.util.*

/*Construa uma função que, a partir de um vetor de 100 inteiros, possibilite:

 a digitação dos valores no vetor;
 imprimir o valor do somatório de seus itens;
 imprimir a média dos valores fornecidos;
 substituir por zero todos os valores negativos;
 substituir por zero todos os valores repetidos (maiores que zero);
 Criar um menu para acessar os itens anteriores.*/

fun main() {

    val MAX_ELEMENTS = 5;
    var numeros = Array(MAX_ELEMENTS, { i -> 3 })
    //println(Arrays.toString(numeros))


    while (true) {
        print("\nArray: " + Arrays.toString(numeros))

        println("\nDigite o número da opção desejada:")
        println("\t 1 - para digitar valores")
        println("\t 2 - para calcular somatório")
        println("\t 3 - para calcular média")
        println("\t 4 - para zerar negativos ")
        println("\t 5 - para zerar repetidos maiores que zero\n")

        var option = readLine()!!.toString().toIntOrNull()
        clearScreen()
        when (option) {
            0 -> break
            1 -> numeros = changeValues(numeros)
            2 -> somatorio(numeros)
            3 -> media(numeros)
            4 -> zeraNegativos(numeros)
            5 -> numeros = zerarNumerosRepetidosMaioresQueZero(numeros)
            else -> continue
        }
    }


}

fun zerarNumerosRepetidosMaioresQueZero(numeros: Array<Int>): Array<Int> {
    val result = numeros.clone()
    for (i in 0..numeros.size - 1) {
        if (numeros[i] > 0) {
            val found = numeros.filter { n -> n == numeros[i] }
            if (found.size > 1) {
                result[i] = 0
            }
        }
    }
    return result
}

fun zeraNegativos(numeros: Array<Int>) {
    for (i in 0..numeros.size - 1) {
        if (numeros[i] < 0) {
            numeros[i] = 0;
        }
    }
}

fun media(numeros: Array<Int>): Double {
    val med: Double = somatorio(numeros).toDouble() / numeros.size.toDouble()
    println("Media: " + med)
    return med
}

fun somatorio(numeros: Array<Int>): Int {
    var soma: Int = 0
    for (numero in numeros) {
        soma += numero
    }
    println("Somatorio: " + soma)
    return soma
}

fun clearScreen() {
    print("\n\n\n")
}

fun changeValues(numeros: Array<Int>): Array<Int> {
    for (i in 0..numeros.size - 1) {
        print("Informe o elemento $i: \n")
        numeros[i] = readLine()!!.toString().toInt()
    }
    return numeros
}


