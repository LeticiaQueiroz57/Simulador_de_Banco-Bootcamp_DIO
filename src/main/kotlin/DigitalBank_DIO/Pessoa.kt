package DigitalBank_DIO

class Pessoa{
    var nome = ""
    var cpf = ""
    var endereco = ""
}

fun main(){
    val p1 = Pessoa()
    p1.nome = "Ana"
    p1.cpf = "123.123.123-11"
    p1.endereco = "Rua Teste"

    println("Nome: ${p1.nome}")
    println("CPF: ${p1.cpf}")
    println("Endereço: ${p1.endereco}")
}