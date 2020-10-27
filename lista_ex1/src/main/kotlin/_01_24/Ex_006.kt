package _01_24

/*Construa uma função que verifique se um dado número é divisível por outro. Ambos devem ser
fornecidos pelo usuário.*/

fun main() {
    print("numero 1: ")
    var numero1 = readLine()!!.toString().toInt()

    print("numero 2: ")
    var numero2 = readLine()!!.toString().toInt()

    print("Pode dividir: " + podeDividir(numero1, numero2))
}

fun podeDividir(num1:Int, num2:Int):String{
    if(num1 % num2 != 0){
        return ("não")
    }
    return ("sim")
}




