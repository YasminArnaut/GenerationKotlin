package heranca

open class Cavalo(
    nome: String, idade: Int

) : Animal(nome, idade) {


    override fun correr() {
        println("Correndo")
    }


    override fun emitirSom(){
        println("Relinchando")
    }
}