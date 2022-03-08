package heranca

open class Cachorro(
    nome: String, idade: Int

) : Animal(nome, idade) {


    override fun correr() {
        println("Correndo")
    }

    override fun emitirSom(){
        println("Latindo")
    }

}