import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = ContaCorrente(
        Cliente(
            nome = "João", cpf = "555.555.555-55", senha = 5
        ), 1002
    )
    contaJoao.titular.nome = "João"

    var contaMaria = ContaCorrente(
        Cliente(
            "Maria", "666.666.666-66", senha = 6
        ), 1003
    )
    contaMaria.titular.nome = "Maria"

    println("titular conta joao: ${contaJoao.titular.nome}")
    println("titular conta maria: ${contaMaria.titular.nome}")

    println("referência do titular de contaJoao: ${contaJoao.titular}")

    println("referência de contaJoao: ${contaJoao}")
    println("referência de contaMaria: ${contaMaria}")

}
