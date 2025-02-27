package com.example.cadastro

class Formulario {
     var nome : String = ""

     var telefone: String =""

     var email: String = ""

     var interesse: Boolean = false

     lateinit var sexo : Sexo

     var cidade: String = ""

     var unidadeFederal : String = ""
     override fun toString(): String {
          return "Formulario(nome='$nome', telefone='$telefone', email='$email', interesse=$interesse, sexo=$sexo, cidade='$cidade', unidadeFederal='$unidadeFederal')"
     }


}