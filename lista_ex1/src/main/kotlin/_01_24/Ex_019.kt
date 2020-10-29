package _01_24

/*A avaliação de aproveitamento de certa disciplina é feita através de quatro provas mensais no valor de
20 pontos e uma prova final no valor de 40 pontos. A nota final é obtida somando-se as três melhores
notas, dentre as provas mensais, com a nota da prova final. O conceito final é dado atendendo-se ao
seguinte critério:
De 90 a 100 – conceito A
De 80 a 89 - conceito B
De 70 a 79 - conceito C
De 60 a 69 - conceito D
De 40 a 59 - conceito E
De 0 a 39 - conceito F
Fazer um procedimento que, recebendo como parâmetro 4 (quatro) números inteiros, devolva ao
módulo que o chamou a soma dos 3 (três) maiores números dentre os 4 (quatro) números recebidos.
Fazer um programa que:
 leia um conjunto de 80 linhas contendo, cada uma, o número do aluno as quatro notas
mensais e a nota da prova final;
 calcule, para cada aluno, sua nota final, utilizando o procedimento anterior;
 verifique o conceito obtido;
 escreva, para cada aluno, o seu número a sua nota final e o seu conceito.*/

val alunos: MutableList<AlunoNota> = ArrayList()

fun main() {

    for (i in 0 until 2) {
        println("\nAlunos: " + alunos + "\n")
        println("Informe o identificador do aluno, suas notas 4 mensais seguidas pela nota final:")
        println("\tex: 12312 20 15 18 20 38")

        var line = readLine()!!.toString()
        var args = line.trim().split(" ")

        alunos.add(AlunoNota(args[0].toInt(), Array(4, { i -> args[i + 1].toInt() }), args[5].toInt()))
    }

    var soma: Int = 0

    when (soma) {
        in 100..90 ->
            print("CONCEITO A")
        in 89..80 ->
            print("CONCEITO B")
        in 79..70 ->
            print("CONCEITO C")
        in 69..60 ->
            print("CONCEITO D")
        in 59..40 ->
            print("CONCEITO E")
        in 39..0 ->
            print("CONCEITO F")
        else ->
            print("Nota inválida")
    }

}


//fun somaDos3Maiores():Int{
//    val soma:Int = 0
//
//}

data class AlunoNota(val id: Int, val provasMensais: Array<Int>, val provaFinal: Int)
