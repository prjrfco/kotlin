package _01_24

/*Construa uma função que verifique, sem utilizar a função mod, se um número é divisível por outro.*/

fun main() {
    print(podeDividirSemMod(7,2))
    print(podeDividirSemMod(6,2))

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
