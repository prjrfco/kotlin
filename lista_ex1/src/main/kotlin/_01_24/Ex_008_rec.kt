package _01_24

import java.lang.RuntimeException

/*Elabore uma função que escreva por extenso um número inteiro com até dez dígitos fornecido pelo
usuário.*/

val UNIDADES = arrayOf("zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove",
    "dez","onze","doze","treze","quatorze","quinze","dezesseis","dezessete","dezoito","dezenove")
val DEZENAS = arrayOf("","dez","vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta","oitenta", "noventa")
val CENTENAS = arrayOf("","cem","duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos","oitocentos", "novecentos")

fun main() {

    while(true) {
        print("\n\nDigite um número: ")

        var numeroDig: Long = readLine()!!.toString().toLong()

        print("Por extenso recursivo: " + extensoRecursivo(numeroDig))

    }
}

fun extensoRecursivo(numeroDig: Long): String{
    if(Math.abs(numeroDig) > 9999999999){
        return "Numero com mais de 10 digitos"
    }
    if(numeroDig < 0){
        return "menos "+ extensoRecursivo(Math.abs(numeroDig))
    }
    when(numeroDig){
        in 0 .. 19
            -> return UNIDADES[numeroDig.toInt()]
        20L,30L,40L,50L,60L,70L,80L,90L
            -> return DEZENAS[numeroDig.toInt() / 10]
        in 21 .. 29, in 31 .. 39, in 41..49, in 51 .. 59, in 61 .. 69, in 71 ..79, in 81 .. 89, in 91 .. 99
            -> return DEZENAS[numeroDig.toInt() / 10] + " e "+ extensoRecursivo(numeroDig % 10)
        100L,200L,300L,400L,500L,600L,700L,800L,900L
            -> return CENTENAS[numeroDig.toInt() / 100]
        in 101 .. 199
            -> return "Cento e "+ extensoRecursivo( numeroDig % 100)
        in 201 .. 299, in 301 .. 399, in 401 .. 499, in 501 .. 599, in 601 .. 699, in 701 .. 799, in 801 .. 899, in 901 .. 999
            -> return CENTENAS[numeroDig.toInt() / 100] + " e " + extensoRecursivo(numeroDig % 100)
        1000L
            -> return "mil"
        in 1001 .. 999999
            -> return extensoRecursivo(numeroDig / 1000) + " mil e " + extensoRecursivo( numeroDig % 1000)
        1000000L
            -> return extensoRecursivo(1)+" milhao "
        in 1000001 .. 1999999
            -> return extensoRecursivo(1000000) + extensoRecursivo(numeroDig % 1000000)
        in 2000000 .. 999999999
            -> return extensoRecursivo(numeroDig / 1000000) + " milhoes " + extensoRecursivo(numeroDig % 1000000)
        1000000000L
            -> return extensoRecursivo(1) + " bilhao "
        in 1000000001 .. 1999999999
            -> return extensoRecursivo(1000000000) + extensoRecursivo(numeroDig % 1000000000)
        in 2000000000 .. 9999999999
            -> return extensoRecursivo(numeroDig / 1000000000) + " bilhoes " + extensoRecursivo( numeroDig % 1000000000)
        else -> return ""
    }
}




