fun main() {

//Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão e pelo menos mais
    // duas opções de construtores conforme sua percepção, com os atributos: nome (String),
    //  endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
    //A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
    //Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
    // Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.

    var cad: Cliente
    var nome: String
    var telefone: String
    while (true) {
        try {

            print("Olá, cliente, Digite o nome:")
            nome = readLine()!!
            print("Digite o numero de telefone:\n")
            telefone = readLine()!!

            cad = Cliente(nome, telefone)
            break
        } catch (e: Exception) {
            println(e.message)
        }
    }
    do {

        println("\nAs opções são:\n")
        println("1 - Adicionar itens no estoque")
        println("2 - Remover itens do estoque")
        println("3 - Listar itens no estoque")
        println("4 - Sair")
        println("\nDigite a opção desejada:")
        val opc = readLine()!!.toInt()


        when (opc) {
            1 -> cad.adicionar()
            2 -> cad.remover()
            3 -> cad.listar()

        }

    }while (opc != 4)


}