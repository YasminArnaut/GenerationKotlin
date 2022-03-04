class Paciente {

    var sexo = ""
    var nome = ""
    var tipo = 0 //1=Clinico 2=Pediatra
    var queixa = ""

    fun tipo() {
        when(tipo){
            1 -> println("O atendimento sera do tipo Clinico")
            2 -> println("O atendimento sera do tipo Pediatrico")
         else -> println("O numero digitado não corresoponde ao atendimento.")
        }

    }
    fun sexo(){
        println("indentificação de genero $sexo atualizado")
    }
    fun nome(){
        println("Agradecemos pela informação responsavel da $nome")
    }
    fun queixa(){
    println("Agradecemos as informações, aguarda com senha de emergência de $queixa aparecer no painel")
    }
}
