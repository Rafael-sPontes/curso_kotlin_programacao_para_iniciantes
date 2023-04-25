fun main() {
    exibirMensagem("Jamilton", 13)
    var result = somar(10, 5)
    println("Resultado = $result")
}

fun exibirMensagem(nome: String, idade: Int) {
    //Bloco de Códigos
    println("Alerta, você não preencheu todos os dados! \nNome: $nome, \nIdade: $idade")
}

fun somar(n1: Int, n2: Int): Int {
    var total = n1 + n2
    return total
    //println("$n1 + $n2 = $total")
}