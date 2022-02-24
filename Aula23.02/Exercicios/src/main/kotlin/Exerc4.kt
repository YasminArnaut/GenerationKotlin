import kotlin.math.pow
import kotlin.math.sqrt

fun main() {

    print("Digite um numero: ")
    val num = readLine()!!.toDouble()
    if (num % 2 == 0.0){
        val raiz = sqrt(num)
        println("O numero $num é par e a raiz quadrada dele é ${"%.2f".format(raiz)}")
    }else{
        val calc = num.pow(2)
        println("O numero $num é impar e o seu quadrado é $calc")
    }
}
