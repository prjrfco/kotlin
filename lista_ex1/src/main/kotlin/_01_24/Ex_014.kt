package _01_24

/*Escreva uma função que calcule a somatória dos n primeiros números de um conjunto. O valor de n
deverá ser fornecido pelo usuário.*/


val lista = aleatorio(10, 0, 10)

fun main() {

    print("Somar os primeiros: ")
    val n: Int = readLine()!!.toString().toInt()

    print("\n\nSoma dos $n primeiros números do conjunto: " + somaN(n) + "\n\n")
    print("Utilizando método somatório do ex5\n")
    somatorio(lista.subList(0, n).toTypedArray())

}

fun somaN(n: Int): Int {
    var soma: Int = 0
    for (i in 0 until n) {
        soma += lista[i]
    }
    return soma
}






