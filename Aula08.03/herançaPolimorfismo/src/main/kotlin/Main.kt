package heranca

/*
Exercícios Herança/Polimorfismo
Crie uma hierarquia de classes conforme abaixo com os seguintes atributos
e comportamentos (observe a tabela), utilize os seus conhecimentos
e distribua as características de forma que tudo o que for comum a todos os animais fique na classe heranca.Animal:
*/

fun main() {

    val cachorro = Cachorro(
        "Mel", 10
    )

    cachorro.correr()
    cachorro.emitirSom()


    val cavalo = Cavalo(
        "Bob", 20
    )

    cavalo.correr()
    cavalo.emitirSom()


    val preguica = Preguica(
        "Theodora", 34
    )

    preguica.subir()
    preguica.emitirSom()


}