fun main() {

    var nPar = 0
    var nImpar = 0

    for (i in 1..10) {
        print("Digite o ${i}° número: ")
        val num = readLine()!!.toInt()

        if (num % 2 == 0) {
            nPar++
        } else {
            nImpar++
        }
    }
            println("A quantidade de numeros pares foi de $nPar e a " +
                    "A quantidade de numeros de impares foi de $nImpar")
}