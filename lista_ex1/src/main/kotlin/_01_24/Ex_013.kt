package _01_24

import java.util.*

/*Faça a leitura de mil números pelo processo de sorteio automático. Os números devem estar entre 0 e
100. Verifique:

qual foi o número sorteado mais vezes;
qual foi o número sorteado - vezes;
qual foi o maior número;
qual foi o menor número;*/

fun main() {
    var freqs = Array(101, { i -> 0 })
    val lista = aleatorio(1000, 0, 101)
    var maior = -1;
    var menor = 101;
    println(lista)
    lista.forEach{numero ->
        if(numero > maior) maior = numero
        if(numero < menor) menor = numero
        freqs[numero] += 1

    }
    println("\nFreqs: " + Arrays.toString(freqs))
    println("Maior: $maior")
    println("Menor: $menor")


}
