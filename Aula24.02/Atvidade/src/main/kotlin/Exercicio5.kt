fun main() {
    //Crie um programa que leia um número do teclado até que encontre
// um número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)

    var soma = 0

    do {

        print("Digite o número: ")
        var num = readLine()!!.toInt()

        soma += num

    } while (num != 0)
    println("A soma de todos os números é $soma")

}