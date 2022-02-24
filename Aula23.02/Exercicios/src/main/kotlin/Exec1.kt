fun main() {
    print("Digite o primeiro numero:")
    val num1 = readLine()!!.toInt()

    print("Digite o segundo numero:")
    val num2 = readLine()!!.toInt()

    print("Digite o terceiro numero:")
    val num3 = readLine()!!.toInt()

    if (num1 > num2 && num1 > num3){
        println("$num1 é o maior numero digitado")
    }else if (num2 > num1 && num2 > num3){
        println("$num2 é o maior numero digitado")
    }else{
        println("$num3 é o maior numero digitado")
    }
}