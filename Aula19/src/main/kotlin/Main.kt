/*
* Loops
*   while
*   for
* */

fun main() {

    /*var num = 1
    while (num <= 5) {
        //Códigos a serem executados
        println("[$num] Executado")
        num++
    }*/

    /*for (num in 1..5) {
        println("[$num] Executado")
    }*/

    val post = arrayOf(
        "Descoberto novo método de tratamento para Diabetes!",
        "Novo curso de Android foi lançado!",
        "Bolsa de valores opera em alta de 2%",
        "Postagem adicionada"
    )

    for ((ind, postag) in post.withIndex()) {
        println("$ind - $postag")
    }
}