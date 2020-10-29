package _01_24

/*Faça a leitura de mil números pelo processo de sorteio automático. Os números devem estar entre 0 e
100. Verifique:

qual foi o número sorteado mais vezes;
qual foi o número sorteado - vezes;
qual foi o maior número;
qual foi o menor número;*/

fun main() {
    var freqs = Array(101, { i -> 0 })
    println("Lista Aleatória: \n")
    val lista = aleatorio(1000, 0, 101)
    var maior = -1
    var menor = 101

    lista.forEach { numero ->
        if (numero > maior) maior = numero
        if (numero < menor) menor = numero
        freqs[numero] += 1
    }

    var maiorFrequencia = 0
    var maisFrequente = 0

    var menorFrequencia = 1000000000
    var menosFrequente = 0

    for (i in 0..100) {
        print("(n=$i, f=" + freqs[i] + ") ")
        if (freqs[i] > maiorFrequencia) {
            maiorFrequencia = freqs[i]
            maisFrequente = i;
        }

        if (freqs[i] > 0 && freqs[i] < menorFrequencia) {
            menorFrequencia = freqs[i]
            menosFrequente = i;
        }
    }
    println("\n\nMaior: $maior")
    println("Menor: $menor")
    println("\nNúmero mais frequente: $maisFrequente (f=$maiorFrequencia)")
    println("Número menos frequente: $menosFrequente (f=$menorFrequencia)")
}
