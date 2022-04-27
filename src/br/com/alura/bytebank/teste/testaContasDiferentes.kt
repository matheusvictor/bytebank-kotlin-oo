import br.com.alura.bytebank.modelo.*

fun testaContasDiferentes() {

    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Matheus", cpf = "222.222.222.22", senha = 2,
            endereco = Endereco(logradouro = "Rua Limoeiro")
        ), numero = 1000
    )
    val contaPoupanca: ContaTransferivel = ContaPoupanca(
        titular = Cliente(
            nome = "Victor", cpf = "333.333.333-33", senha = 3
        ), numero = 2000
    )
    val contaSalario = ContaSalario(
        titular = Cliente(
            nome = "Dexter", cpf = "444.444.444-44", senha = 4
        ), numero = 3000
    )

    contaCorrente.deposita(300.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(2000.0)

    println("Saldo conta corrente: R$ ${contaCorrente.saldo}")
    println("Saldo conta poupança: R$ ${contaPoupanca.saldo}")
    println("Saldo conta salário: R$ ${contaSalario.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(1000.0)

    println("Saldo conta corrente após saque: R$ ${contaCorrente.saldo}")
    println("Saldo conta poupança após saque: R$ ${contaPoupanca.saldo}")
    println("Saldo conta salário após saque: R$ ${contaSalario.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente, senha = 2)

    /**
     * Não é possível realizar contaSalario.transfere(200.0, contaCorrente), pois esse
     * tipo de conta não possui tal método
     */

    println("Saldo conta corrente após receber transferência: R$ ${contaCorrente.saldo}")
    println("Saldo conta poupança após fazer transferência: R$ ${contaPoupanca.saldo}")
    // println("Saldo conta salário após fazer transferência: R$ ${contaSalario.saldo}")

    println("Endereço de ${contaCorrente.titular.nome}: ${contaCorrente.titular.endereco}")

}
