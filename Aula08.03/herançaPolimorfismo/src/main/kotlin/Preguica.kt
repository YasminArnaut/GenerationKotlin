package heranca

open class Preguica(
    nome: String, idade: Int

) : Animal(nome, idade) {



    fun subir() {
        println("Sudindo na arvore")
    }

    override fun emitirSom() {
        println("Balidos de tristeza")
    }

}