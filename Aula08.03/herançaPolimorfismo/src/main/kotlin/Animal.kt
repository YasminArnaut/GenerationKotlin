package heranca

open class Animal(val nome: String, var idade: Int) {


    open fun correr() {
        println("Correndo")
    }

    open fun emitirSom(){
        println("")
    }
}