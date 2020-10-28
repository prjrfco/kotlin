package _01_24

/*Necessita-se calcular alguns dados correspondentes aos animais de uma fazenda. Os animais
pertencem a espécies diferentes, a saber: bovinos, ovinos e caprinos. Construa uma função para
calcular a média de peso de cada espécie para os animais de sexo feminino e do sexo masculino, a
partir de dados fornecidos pelo usuário.*/

var bovinos: MutableList<Animal> = ArrayList()
var ovinos: MutableList<Animal> = ArrayList()
var caprinos: MutableList<Animal> = ArrayList()

fun main() {

//    bovinos.add(Animal("M",14.0))
//    bovinos.add(Animal("M",10.0))
//    bovinos.add(Animal("M",16.0))
//    bovinos.add(Animal("F",12.0))
//    bovinos.add(Animal("F",5.0))
//
//
//    ovinos.add(Animal("M",14.0))
//    ovinos.add(Animal("M",10.0))
//    ovinos.add(Animal("M",16.0))
//    ovinos.add(Animal("M",12.0))
//    ovinos.add(Animal("F",5.0))
//
//    caprinos.add(Animal("F",14.0))
//    caprinos.add(Animal("M",10.0))
//    caprinos.add(Animal("F",16.0))
//    caprinos.add(Animal("M",12.0))
//    caprinos.add(Animal("F",5.0))

    while (true) {
        println("Bovinos da fazenda: " + bovinos)
        println("Ovinos da fazenda: " + ovinos)
        println("Caprinos da fazenda: " + caprinos)
        println("\n\nSelecione uma opção:")
        println("\t0 - calcular a média de peso por espécie")
        println("\t1 - cadastrar novo bovino")
        println("\t2 - cadastrar novo ovino")
        println("\t3 - cadastrar novo caprino")

        val option = readLine()!!.toString().toInt();
        when (option) {
            0 -> {
                calculaMedias(bovinos, "Bovinos")
                calculaMedias(ovinos, "Ovinos")
                calculaMedias(caprinos, "Caprinos")
            }
            in 1..3 -> lerAnimal(option)
            else -> {
                print("bye!!")
                return
            }
        }
    }
}

fun lerAnimal(option: Int) {
    println("Informe o sexo:")
    println("\tM - masculino")
    println("\tF - feminino")
    var sexo = readLine()!!.toString()
    when (sexo) {
        "F", "f" -> sexo = "F"
        "M", "m" -> sexo = "M"
        else -> sexo = "U"
    }
    println("Informe o peso:")
    val peso = readLine()!!.toString().toDouble();
    val animal: Animal = Animal(sexo, peso)
    when (option) {
        1 -> bovinos.add(animal)
        2 -> ovinos.add(animal)
        3 -> caprinos.add(animal)
    }

}

fun calculaMedias(animais: MutableList<Animal>, especie: String) {
    var somaFemeas = 0.0
    var somaMachos = 0.0
    var femeas = animais.filter { animal -> animal.sexo.contentEquals("F") }
    val mediaFemeas = femeas.stream().map { animal -> animal.peso }
        .reduce { a: Double, b: Double -> a + b }.get() / femeas.size

    var machos = animais.filter { animal -> animal.sexo.contentEquals("M") }
    val mediaMachos = machos.sumByDouble { animal -> animal.peso } / machos.size

    println("\nNúmero de $especie Fêmeas: " + femeas.size)
    println("Média de peso para $especie Fêmeas: " + mediaFemeas)
    println("\nNúmero de $especie Machos: " + machos.size)
    println("Média de peso para $especie Fêmeas: " + mediaMachos)

}


data class Animal(val sexo: String, val peso: Double)
