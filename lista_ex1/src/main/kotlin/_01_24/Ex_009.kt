package _01_24

/*Construa uma função que verifique, sem utilizar a função mod, se um número é divisível por outro.*/

fun main() {

    print("Número 1: ")
    var numero1 = readLine()!!.toString().toInt()

    print("Número 2: ")
    var numero2 = readLine()!!.toString().toInt()

    print(podeDividirSemMod(numero1, numero2))

}


fun podeDividirSemMod(num1:Int, num2:Int):String{
    var resultadoInt:Int
    resultadoInt = num1 / num2
    print("ResultadoInt: $resultadoInt")
    if(resultadoInt * num2 == num1){
        return "sim"
    }
    return "não"
}
