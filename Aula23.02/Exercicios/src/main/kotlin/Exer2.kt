fun main() {
    //num 1 num2 num3
    //num 1 num2 num3
    //num 1 num2 num3
    //num 1 num2 num3
    //num 1 num2 num3
    //num 1 num2 num3

    print("Digite o primeiro numero:")
    val num1 = readLine()!!.toInt()

    print("Digite o segundo numero:")
    val num2 = readLine()!!.toInt()

    print("Digite o terceiro numero:")
    val num3 = readLine()!!.toInt()

    if (num1 <= num2 && num2 <= num3) {
        println("$num1 - $num2 - $num3")
    } else if (num1 <= num3 && num3 <= num2) {
        println("$num1 - $num3 - $num2")
    } else if (num2 <= num1 && num1 <= num3) {
        println("$num2 - $num1 - $num3")
    } else if (num2 <= num3 && num3 <= num1) {
        println("$num2 - $num3 - $num1")
    } else if (num3 <= num1 && num1 <= num2) {
        println("$num3 - $num1 - $num2")
    } else {
        println(("$num3 - $num2 - $num1"))
    }

}