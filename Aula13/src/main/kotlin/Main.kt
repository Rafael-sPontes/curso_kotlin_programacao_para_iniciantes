/*MODIFICADORES DE ACESSO
* private   -> Visível apenas dentro da classe
* protected -> Funciona como o "private", mas é visível em subclasses
* public    -> Visívível em todo lugar, caso não seja definido é o padrão
* internal  -> Lembra o "public", mas sua visibilidade é restringida ao módulo,
*              sendo então visível dentro de um mesmo módulo
* */

fun main() {

    val animal = Animal()
    //println(animal.nome)

    val cao = Cao()
    cao.exibeNome()
}

open class Animal {
    //private, protected, public
    /*private*/ protected var nome = "Marley"

    fun dormir() {
        println("Dormir")
    }
}

open class Cao: Animal() {
    fun exibeNome() {
        println("Método exibe nome: $nome")
    }
}