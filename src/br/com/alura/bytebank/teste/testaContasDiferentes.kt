import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.ContaSalario
import br.com.alura.bytebank.modelo.ContaTransferivel

fun testaContasDiferentes() {

    val contaCorrente = ContaCorrente(titular = "Matheus", numero = 1000)
    val contaPoupanca: ContaTransferivel = ContaPoupanca(titular = "Victor", numero = 2000)
    val contaSalario = ContaSalario(titular = "Dexter", numero = 3000)

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

    contaPoupanca.transfere(200.0, contaCorrente)

    /**
     * Não é possível realizar contaSalario.transfere(200.0, contaCorrente), pois esse
     * tipo de conta não possui tal método
     */

    println("Saldo conta corrente após receber transferência: R$ ${contaCorrente.saldo}")
    println("Saldo conta poupança após fazer transferência: R$ ${contaPoupanca.saldo}")
    // println("Saldo conta salário após fazer transferência: R$ ${contaSalario.saldo}")

}
