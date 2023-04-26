fun main() {

    //PRIMEIRA PARTE
    /*var opcao = 4
    when (opcao) {
        1 -> {
            println("Café com Leite")
            println("Melhor opção da Casa!")
        }
        2 -> println("Chocolate Quente")
        else -> {
            println("Nenhuma opção selecionada")
            println("Selecione uma opção!")
        }
    }*/

    //SEGUNDA PARTE
    /*var opcao = 3
    when (opcao) {
        1 -> println("Café com Leite")
        2 -> println("Chocolate Quente")
        else -> println("Nenhuma opção selecionada")
    }*/

    var opcao = 2
    var result = when (opcao) {
        1 -> "Café com Leite"
        2 -> "Chocolate Quente"
        else -> "Nenhuma opção selecionada"
    }
    println(result)
}