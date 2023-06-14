package com.filipe.modulo_4

class Filtros {
}

fun main() {
   val estado = listOf("rio","sao paulo","bahia","alagoas")
   val cidade = listOf("rio","bragança","vitoria","maragogi")

   val tamanhoMaior = cidade.filter { it.length > 4 }
   val tamanhoMenor = cidade.filterNot{it.length > 4}

   val mma = estado.map { "Bem Vindo $it" }
   val concatenacao = cidade.zip(estado){name1,name2-> "bem vindo a $name1 da cidade de $name2"}

   val associ = cidade.associateBy { it.length  }
   val asso = cidade.associateWith { it.length }

   //print
   println(tamanhoMaior)
   println(tamanhoMenor)
   println(mma)
   println(concatenacao)
   println(associ)
   println(asso)

   estado.forEach{
      println(it)
   }

   cidade.filter{
      it.length > 5
   }.map {
      "ola $it" }.forEach{
      println(it)
   }


}