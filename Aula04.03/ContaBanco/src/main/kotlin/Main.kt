fun main() {


    var conta = ContaBanco()
    conta.titular = "Yasmin"
    conta.tipo = 1
    conta.saldo = 614.00

    println("Digite o valor de saque:")
    val saque =  readLine()!!.toDouble()

    conta.saque(saque)

    println("\nDigite o valor de deposito:")
    val deposito =  readLine()!!.toDouble()

    conta.deposito(deposito)

    conta.mostrarSaldo()

}