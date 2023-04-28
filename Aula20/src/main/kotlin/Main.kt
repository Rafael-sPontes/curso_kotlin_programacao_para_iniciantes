/*
* INTERFACE
*
* Pode se dizer, a grosso modo, que uma interface é um contrato que
* quando assumido por uma classe deve ser implementedo.
*
* Interface é utilizada pois podemos ter muitos objetos (classes) que podem
* possuir a mesma ação (métodos) porém, podem exxecutá-las de maneira difrente
* */

fun main() {
    val jamilton = Jamilton()
    jamilton.direitosDeveres()

    val obama = Obama()
    obama.direitosDeveres()
    obama.ganharEleicao()
    obama.temFilho()
}

//CLASSES
open class Cidadao {
    fun direitosDeveres() {
        println("Todo cidadão tem direitos e deveres!")
    }
}

class Obama: Cidadao(), Presidente, Pai {
    override fun ganharEleicao() {
        println("Ganhar Eleição nos EUA")
    }

    override fun temFilho() {
        println("Tem filho!")
    }
}

class Jamilton: Cidadao(), Presidente {
    override fun ganharEleicao() {
        println("Ganhar Eleição no Brasil")
    }
}

//INTERFACES
interface Presidente {
    fun ganharEleicao()
}

interface Pai {
    fun temFilho()
}