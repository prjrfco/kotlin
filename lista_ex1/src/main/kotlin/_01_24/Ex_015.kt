package _01_24

/*Escreva uma função que calcule o número de horas de determinado período estabelecido por duas
datas.*/

fun main() {

//    var dataA:LocalDate = LocalDate.parse("1990-04-26")
//    var dataB:LocalDate = LocalDate.parse("2020-04-28")
//    var timestampA = dataA.atStartOfDay()!!
//    var timestampB = dataB.atStartOfDay()!!
//    println("A=$dataA ($timestampA) B=$dataB ($timestampB)")
//    println("Difference: "+ ChronoUnit.HOURS.between(timestampA, timestampB))

    print("Informe a primeira data separada por / (ex.: 29/12/2020): ")
    val data1: String = readLine()!!.toString()
    val splitedDate1 = data1.trim().split("/")
    val dia1 = splitedDate1[0].toInt()
    val mes1 = splitedDate1[1].toInt()
    val ano1 = splitedDate1[2].toInt()
    val dias1: Int = (ano1 * 365) + (mes1 * 30) + dia1

    print("Informe a segunda data separada por / (ex.: 29/12/2020): ")
    val data2: String = readLine()!!.toString()
    val splitedDate2 = data2.trim().split("/")
    val dia2 = splitedDate2[0].toInt()
    val mes2 = splitedDate2[1].toInt()
    val ano2 = splitedDate2[2].toInt()
    val dias2: Int = (ano2 * 365) + (mes2 * 30) + dia2

    val intervaloDias: Int = dias2 - dias1

    print("Intervalo: " + (intervaloDias % 365) % 30 + "/" + (intervaloDias % 365) / 30 + "/" + intervaloDias / 365)

    println("\n\nIntervalo em horas: " + horasDias(intervaloDias) + "h")

}

fun horasDias(intervaloDias: Int): Int {
    return (intervaloDias * 24)
}


