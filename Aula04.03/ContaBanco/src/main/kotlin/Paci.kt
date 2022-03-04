fun main() {

    var paci = Paciente()

    println("Escolha um número que deseja atendimento: \n1- Clínico \n2- Pediátrico")
    val tipo = readLine()!!.toInt()
    paci.tipo = tipo
    paci.tipo()

    println("\nIndentifique seu gênero: ")
    val sexo = readLine()!!
    paci.sexo = sexo
    paci.sexo()

    println("\nInforme o Nome do paciente: ")
    var nome = readln()!!
    paci.nome = nome
    paci.nome()

    println("\nFavor distinguir a queixa da paciente, para encaminharmos ela a triagem: ")
    var queixa = readln()!!
    paci.queixa = queixa
    paci.queixa()
}