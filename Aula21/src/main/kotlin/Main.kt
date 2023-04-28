/*
* COLLECTIONS / COLEÇÕES
*
* Collections / Coleções -> São implementações de estruturas de dados
*   - List -> Imutável, tamanho fixo, apenas para leitura
*   - ArrayList -> Mutável , sem tamanho fixo , pode adicionar ou remover
* */

fun main() {

    /*PRIMEIRA PARTE
    var listaItens = listOf("SP", "RJ", "MG")

    //NÃO ADICIONA
    //listaItens.add("BA")
    //listaItens[0] = "BA"

    println(listaItens)*/

    /*SEGUNDA PARTE
    var listaItens = arrayOf("SP", "RJ", "MG")

    //NÃO ADICIONA
    //listaItens.add("BA")

    listaItens[0] = "BA"*/

    /*TERCEIRA PARTE*/
    var listaItens = arrayListOf("SP", "RJ", "MG")

    listaItens.add("BA")
    //listaItens.remove("SP")
    //listaItens.removeAt(0)
    listaItens[0] = "MA"

    //println(listaItens)
    println(listaItens)
    println(listaItens.size)
    println(listaItens.isEmpty())
}