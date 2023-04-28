import jdk.jshell.Snippet.Status

/*ENUM
*
* Enum (Enumeração) -> É um tipo de dados
* que consiste em um conjunto de constantes*/

fun main() {

    val pedido = Pedido()
    pedido.status = StatusPedido.APROVADO

    if (pedido.status == StatusPedido.PROCESSANDO) {
        println("Pedido está sendo Processado!")
    } else if (pedido.status == StatusPedido.APROVADO) {
        println("Pedido foi Aprovado!")
    }
}

//ENUM CLASS
enum class StatusPedido {
    PROCESSANDO, APROVADO, REPROVADO
}

//CLASSES
class Pedido {
    var status: StatusPedido = StatusPedido.PROCESSANDO
}