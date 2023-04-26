fun main() {

    /*CONTROLE DE FLUXO DE EXECUÇÃO
    if ( condição ) {
        //Caso a condição seja satisfeita
    }*/

    //PRIMEIRA PARTE
    /*if (true) {
        println("1º_if Verdadeiro")
    } else {
        println("1º_if Falso")
    }

    if (false) {
        println("2º_if Verdadeiro")
    } else {
        println("2º_if Falso")
    }

    if (5 == 5) {
        println("3º_if Verdadeiro")
    } else {
        println("3º_if Falso")
    }

    if (5 == 6) {
        println("4º_if Verdadeiro")
    } else {
        println("4º_if Falso")
    }

    if (5 > 5) {
        println("5º_if Verdadeiro")
    } else {
        println("5º_if Falso")
    }

    if (8 > 5) {
        println("6º_if Verdadeiro")
    } else {
        println("6º_if Falso")
    }

    if (5 == 5 && 6 == 6) {
        println("7º_if Verdadeiro")
    } else {
        println("7º_if Falso")
    }

    if (4 == 5 && 6 == 6) {
        println("8º_if Verdadeiro")
    } else {
        println("8º_if Falso")
    }

    if (4 == 5 || 6 == 6) {
        println("9º_if Verdadeiro")
    } else {
        println("9º_if Falso")
    }

    if (5 == 5 || 6 == 6) {
        println("10º_if Verdadeiro")
    } else {
        println("10º_if Falso")
    }*/

    //SEGUNDA PARTE
    /*var idade = 24

    if (idade < 14) {
        println("Criança de $idade Anos")
    } else if (idade >= 14 && idade < 18) {
        println("Adolescente de $idade Anos")
    } else {
        println("Adulto de $idade Anos")
    }*/

    //TERCEIRA PARTE
    /*var media1 = 8
    if (media1 >= 6) {
        println("Aprovado, média1: $media1")
    } else {
        println("Reprovado, média1: $media1")
    }

    var media2 = 6
    if (media2 >= 6) {
        println("Aprovado, média2: $media2")
    } else {
        println("Reprovado, média2: $media2")
    }

    var media3 = 5
    if (media3 >= 6) {
        println("Aprovado, média3: $media3")
    } else {
        println("Reprovado, média3: $media3")
    }*/

    //QUARTA PARTE
    var media = 5
    var result = if (media >= 6) "Aprovado, M:$media" else "Reprovado, M:$media"
    println(result)
}