fun testaContasDiferentes() {
    val contaCorrente: Conta = ContaCorrente(
        titular = "Matheus",
        numero = 1000
    )

    val contaPoupanca: Conta = ContaPoupanca(
        titular = "Victor",
        numero = 2000
    )

    contaCorrente.deposita(300.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo conta corrente: R$ ${contaCorrente.saldo}")
    println("Saldo conta poupança: R$ ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo conta corrente após saque: R$ ${contaCorrente.saldo}")
    println("Saldo conta poupança após saque: R$ ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente)

    println("Saldo conta corrente após receber transferência: R$ ${contaCorrente.saldo}")
    println("Saldo conta poupança após fazer transferência: R$ ${contaPoupanca.saldo}")
}
