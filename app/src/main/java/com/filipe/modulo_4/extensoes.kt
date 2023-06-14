package com.filipe.modulo_4

class extensoes {
}

fun main() {
 var number = 4
  println(number.isEven())

  val nome = "filipe"
  println(nome.concatenait("cesar"))
// a diferença e que o infix nao precisa de ponto
  val cidade = 12 sum 13
  println(cidade)
}

fun Int.isEven(): Boolean{
    return this %2  == 0
}
fun String.concatenait(valor:String):String{
    return this + valor
}

infix fun Int.sum(val1: Int):Int{
    return this + val1
}