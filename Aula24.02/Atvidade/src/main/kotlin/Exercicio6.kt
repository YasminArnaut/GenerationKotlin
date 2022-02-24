fun main() {

    var soma = 0
    var cont = 0

    do{

        print("Digite qualquer número diferente de 0:")
        val num = readLine()!!.toInt()

        if (num % 3 == 0){
            cont++
            soma += num

        }
    }while (num != 0)

    val media = soma / cont
    println("Dentro os números digitados, $cont são divisiveis por 3 " +
    "e a media desses números é $media")
}