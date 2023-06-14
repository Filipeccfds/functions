package com.filipe.modulo_4

class func {
}

fun main() {
    val resultado = concatenacao("filipe","cesar")
    println(resultado)
}

fun filipe(num1:Int, num2:Int){
    println(num1 + num2)
}
//funcao com retorno
fun concatenacao (vla1: String , vla2: String):String{
    return vla1 +" "+ vla2
}

//funcao compacta
// Int = 12 no caso estamos passando um valor default caso o parametro nao seja usado
fun lia (val1:Int, val2:Int = 12) = println(val1 * val2)
