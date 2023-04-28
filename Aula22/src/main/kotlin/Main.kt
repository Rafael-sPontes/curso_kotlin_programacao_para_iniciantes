/*
* SET / MAP
*
* Set -> Não permite elementos duplicados, é mais rápido que o ArrayList,
* não mantém a ordem dos elementos
* Map -> É uma implementação Chave / Valor
* */

fun main() {

    /*PRIMEIRA PARTE
    var itens = hashSetOf("a", "b", "c", "c")

    for (item in itens) {
        println(item)
    }

    println(itens)*/

    /*SEGUNDA PARTE
    var itens = hashSetOf(10, 20, 30, 50, 70)

    for (item in itens) {
        println(item)
    }

    println(itens)*/

    //TERCEIRA PARTE
    var map = hashMapOf(
        "urso" to "Animal que hiberna",
        "cao" to "Melhor amigo do homem"
    )

    map.put("passaro", "Gosta de voar")

    for (item in map.keys) {
        println(item)
    }

    //map.remove("passaro")

    println("\n")

    for (item in map.values) {
        println(item)
    }

    //println(map)
    //println(map.size)
}