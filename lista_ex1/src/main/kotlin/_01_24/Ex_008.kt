package _01_24

/*Elabore uma função que escreva por extenso um número inteiro com até dez dígitos fornecido pelo
usuário.*/

fun main() {

    print("Digite um número: ")

    var numeroDig: Int = readLine()!!.toString().toInt()

    print("Por extenso: " + porExtenso(numeroDig))

}

fun porExtenso(numeroDig: Int): String {
    var result = ""
    val numeros = arrayOf("zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove")

    val numeroString = numeroDig.toString()

    for (i in 0..numeroString.length - 1) {
        var n = Character.getNumericValue(numeroString[i])
        result += numeros[n] + " "
    }
    return result
}




