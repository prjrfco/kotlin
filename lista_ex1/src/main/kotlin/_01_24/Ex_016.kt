package _01_24

/*Construa uma função que identifique se um número é ou não primo.*/

fun main() {

    print("Digite um número: ")
    val numero:Int = readLine()!!.toString().toInt()

    print("\n\nÉ primo: "+ ehPrimo(numero))
}

fun ehPrimo(numero: Int): Boolean {
    for (i in 2 until numero) {
        if (numero % i == 0) return false
    }
    return true
}
