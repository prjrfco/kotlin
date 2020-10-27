package _01_24
/*Crie um método chamado aleatório que sorteie uma determinada quantidade de números de acordo
com um argumento. O usuário deve informar a quantidade de números a ser gerada e a faixa de
números válidos para o sorteio, por exemplo: se o usuário informar os argumentos 4 e 100
(aleatório(4,100)), devem ser gerados quatro números aleatórios entre 1 e 100.*/

import kotlin.random.Random

fun main() {

    print("Selecionar: ")
    var qtd = readLine()!!.toString().toInt()

    print("Entre 1 e : ")
    var numero = readLine()!!.toString().toInt()

    aleatorio(qtd, numero)

}

fun aleatorio(qtd:Int, numero:Int) {
    val randomValues = List(qtd) { Random.nextInt(1, numero) }
    println(randomValues)
}
