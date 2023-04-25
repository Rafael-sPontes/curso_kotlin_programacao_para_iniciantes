fun main() {

    //Ao utilizar var, é criada uma variável mutável
    var usuario = "Jamilton Damasceno"
    usuario = "José"

    //Ao utilizar val, é criada uma variável imutável
    val pi = 3.14

    var salario = 1000
    var bonus = 200

    var total = salario + bonus

    println(usuario)
    println(pi)
    println("O salário é: R$$total")
}