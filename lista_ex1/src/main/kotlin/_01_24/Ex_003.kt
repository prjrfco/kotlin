package _01_24

/*Crie um aplicativo que faça a contagem regressiva de um número inteiro informado pelo usuário. O
usuário deve informar também o espaço de tempo entre cada contagem (em segundos). Controle o
tempo com um método tempo() contido em outra classe. Crie uma nova classe para esse método do
tempo() ou aproveite do exemplo 3.*/

fun main() {

    print("Informe um número: ")

    var intInput = readLine()!!.toString().toInt()

    print("Informe um intervalo de tempo: ")

    var intTime = readLine()!!.toString().toIntOrNull()

    if (intTime == null) {
        intTime = 0
    }

    decrementaComIntervalo(intInput, intTime)
}

fun decrementaComIntervalo(number: Int, interval: Int) {
    var n = number
    print("Iniciando contagem ...")
    do {
        print("Contador: $n")
        Thread.sleep((interval * 1000).toLong())
        print("Contador: $n")
        n -= 1
    } while (n > 0)
}
