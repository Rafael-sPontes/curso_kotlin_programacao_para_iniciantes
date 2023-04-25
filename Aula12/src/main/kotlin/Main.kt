fun main() {
    val cao = Cao()
    cao.dormir()
    cao.correr()
    cao.latir()

    println("\n")

    val passaro = Passaro()
    passaro.dormir()
    passaro.correr()
    passaro.voar()
}

open class Animal {
    open fun dormir() {
        println("Dormir")
    }

    fun correr() {
        println("Correr")
    }
}

class Cao: Animal() {
    override fun dormir() {
        super.dormir()
        println("como um Cão")
    }

    fun latir() {
        println("Latir")
    }
}

class Passaro: Animal() {
    override fun dormir() {
        super.dormir()
        println("como um Pássaro")
    }

    fun voar() {
        println("Voar")
    }
}