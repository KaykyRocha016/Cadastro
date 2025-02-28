package com.example.cadastro

class Formulario {

     var nome : String = ""

     var telefone: String =""

     var email: String = ""

     var interesse: Boolean = false

     lateinit var sexo : Sexo

     var cidade: String = ""

     var unidadeFederal : String = ""

     constructor(
          nome: String,
          telefone: String,
          email: String,
          interesse: Boolean,
          sexo: Sexo,
          cidade: String,
          unidadeFederal: String
     ) {
          this.nome = nome
          this.telefone = telefone
          this.email = email
          this.interesse = interesse
          this.sexo = sexo
          this.cidade = cidade
          this.unidadeFederal = unidadeFederal
     }


     override fun toString(): String {
          return "Formulario(nome='$nome', telefone='$telefone', email='$email', interesse=$interesse, sexo=$sexo, cidade='$cidade', unidadeFederal='$unidadeFederal')"
     }




}