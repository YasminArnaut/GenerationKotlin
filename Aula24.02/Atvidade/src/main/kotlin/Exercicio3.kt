fun main() {

    var idade = 0
    var soma = -1
    var soma1 = 0

    while (idade != -99){

        print("Digite sua idade:")
        idade = readln()!!.toInt()

        if (idade < -21){
            soma ++

        }else if (idade > 50) {
            soma1++

        }
    }
    print("$soma $soma1")
}

