
fun main() {
    print("Digite sua idade em qual categoria ela se encontra" + "ela se encontra:")
    val idade = readLine()!!.toInt()
    //10-14 infantil
    //15-17 juvenil
    // 18-25 adulto

    when(idade){
        in 10..14 -> println("Infatil")
        in 15..17 -> println("Juvenil")
        in 18..25 -> println("Adulto")
    }
}