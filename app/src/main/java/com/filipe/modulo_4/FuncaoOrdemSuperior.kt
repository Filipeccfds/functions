package com.filipe.modulo_4

class FuncaoOrdemSuperior {
}

fun main() {
    //funcao curta
    val cont:(String,String)->Unit = {vale1,vale2 -> vale1 + vale2}
    val number = {valor1:String, valor2:String -> println(valor1 + valor2) }

    //LAMBDA
    val yetz :(Int) ->Int = {it/2}

    val operacao = {num1:Int, num2:Int ->
        var resultado = num1+num2
        resultado= resultado / num2
        resultado= resultado + num1 + num2
        resultado
    }

    funcaoHigh("fer","cs", ::soma)
    funcaoHigh("fer","cs", ::leng)
}

fun soma(val1: String,val2: String) = println(val1 + val2)
fun leng(str1: String,str2: String) = println(" o tamanho de ${str1.length}, o tamanho de ${str2.length}" )
fun funcaoHigh (str1:String, str2:String, operation:(String,String)->Unit){
    operation(str1,str2)
}
//funcao lambda
