class ContaBanco {

    var titular = ""
    var tipo = 0 // 1=conta corrente - 2=conta poupanca
    var saldo = 0.0


    fun mostrarSaldo(){
        println("O saldo da sua conta é R$saldo")
    }
    fun deposito(valor: Double){
        if(valor <= 0){
            println("deposito impossível de ser realizado")
        }else{
            saldo += valor
            println("deposito de R$valor realizado com sucesso!")
        }
    }
    fun saque (valor: Double){

        if(saldo <= 0){
            println("saldo insuficiente")
        }else if(valor <= 0){
        }else if (valor >= saldo){
            println("saldoo insuficiente")
        } else{
            saldo = saldo - valor
            println("saque de R$valor realizado com sucesso!")
        }
    }
}
