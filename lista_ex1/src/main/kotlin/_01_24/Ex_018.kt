package _01_24
/*Construa uma função que calcule o somatório dos n primeiros termos da série de Fibonnacci.*/

var a: Int = 1
var b: Int = 0
var aux2: Int = 0

fun main() {

    print("Digite o número de elementos da sequencia de fibonacci: ")
    val nElement: Int = readLine()!!.toString().toInt()

    println("Soma dos valores: " + fibonnaci(nElement))
}

fun fibonnaci(n: Int): Int {
    var soma: Int = -1
    for (i in 0..n) {
        aux2 = a + b
        a = b
        b = aux2
        if (i != 0) {
            println(aux2)
        }
        soma += aux2
    }
    return soma
}
