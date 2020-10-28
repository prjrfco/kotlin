package _01_24

/*Dada uma data abreviada, escreva-a por extenso.*/

val DIAS = arrayOf(
    "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove",
    "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove",
    "vinte", "vinte e um", "vinte e dois", "vinte e três", "vinte e quatro", "vinte e cinco", "vinte e seis", "vinte e sete", "vinte e oito", "vinte e nove",
    "trinta", "trinta e um"
)

val MESES = arrayOf(
    "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho",
    "agosto", "setembro", "outubro", "novembro", "dezembro"
)


fun main() {
//    print("Informe o dia: ")
//    var dia:Int = readLine()!!.toString().toInt()
//
//
//    print("Informe o mes: ")
//    var mes:Int = readLine()!!.toString().toInt()
//
//    print("Informe o ano: ")
//    var ano:Int = readLine()!!.toString().toInt()

    print("Informe a data separada por / (ex.: 29/12/2020): ")
    val data:String = readLine()!!.toString()
    val splitedDate = data.trim().split("/")
    val dia = splitedDate[0].toInt()
    val mes = splitedDate[1].toInt()
    val ano = splitedDate[2].toInt()


    print("Data por extenso: " + dataPorExtenso(dia, mes,ano))
}

fun dataPorExtenso(dia: Int, mes:Int, ano:Int): String {

    val diaEx = extensoRecursivo(dia.toLong())
    val mesEx = MESES[mes-1]
    val anoEx = extensoRecursivo(ano.toLong())

    return "$diaEx de $mesEx de $anoEx"
}


