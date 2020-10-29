package _01_24

/*Construa uma função que calcule a somatória de todos os números primos contidos em um conjunto de
n elementos. O valor de n deverá ser fornecido pelo usuário.*/

fun main() {

    print("Número de elesmentos da lista: ")
    val nElementos: Int = readLine()!!.toString().toInt()

    print("Lista aleatória:\n")
    var lista = criarLista(nElementos)

    print("Soma de todos os números primos da lista: " + somaPrimos(lista))

}

fun somaPrimos(numeros: List<Int>): Int {
    var soma = 0
    for (numero in numeros) {
        if (ehPrimo(numero)) {
//            println(numero)
            soma += numero
        }
    }
    return soma
}

fun criarLista(n: Int): List<Int> {
    val lista = aleatorio(n, 0, 10)
    return lista
}
