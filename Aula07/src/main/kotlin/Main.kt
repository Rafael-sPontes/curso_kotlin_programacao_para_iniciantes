fun main() {
    val nomes = arrayOf<String>("Jamilton", "Letícia", "Mariana", "José")
    var num = arrayOf(20, 30, 40)

    println("1º - " + nomes[0])
    nomes[0] = "Pedro"
    println("2º - " + nomes[0])
    println(nomes[1])
    println(nomes[2])
    println(nomes[3])

    println(num[0])
    println(num[1])
    println(num[2])
}