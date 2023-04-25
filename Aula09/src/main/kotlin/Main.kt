fun main() {
    print("\n")

    val casa1 = Casa()
    casa1.cor = "Amarela"
    print("Casa1 - Cor: ")
    println(casa1.cor)
    print("Status: ")
    casa1.abrirJanela(1)
    print("\n\n")

    val casa2 = Casa()
    casa2.cor = "Vermelha"
    print("Casa2 - Cor: ")
    println(casa2.cor)
    print("Status: ")
    casa2.abrirPorta(2)
    print("\n\n")

    val casa3 = Casa()
    casa3.cor = "Azul"
    print("Casa3: ")
    println(casa3.cor)
    print("Status: ")
    casa3.abrirCasa(3)
    print("\n")
}

class Casa {

    //ATRIBUTOS
    var cor: String = ""

    //MÉTODOS
    fun abrirJanela(nJan: Int) {
        print("Total de Janelas: $nJan")
    }

    fun abrirPorta(nPor: Int) {
        print("Total de Portas: $nPor")
    }

    fun abrirCasa(nCasa: Int) {
        this.abrirJanela(nCasa)
        print(" / ")
        this.abrirPorta(nCasa)
    }
}