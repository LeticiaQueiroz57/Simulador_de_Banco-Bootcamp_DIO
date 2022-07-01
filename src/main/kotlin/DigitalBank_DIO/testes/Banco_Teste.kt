package DigitalBank_DIO.testes

import DigitalBank_DIO.Banco

fun main(){
    val digiOneBank = Banco("DigiOne",12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)
}