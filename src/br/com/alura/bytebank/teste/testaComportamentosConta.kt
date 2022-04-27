import br.com.alura.bytebank.excecao.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    println("Bem vindo ao Bytebank")

    val clienteAlex = Cliente(nome = "Alex", cpf = "000.000.000-00", senha = 0)
    val contaAlex = ContaCorrente(titular = clienteAlex, numero = 1000)
    contaAlex.deposita(200.0)

    val clienteFran = Cliente(nome = "Fran", cpf = "111.111.111-11", senha = 1)
    val contaFran = ContaPoupanca(numero = 1001, titular = clienteFran)
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Alex")

    try {
        contaFran.transfere(destino = contaAlex, valor = 300.0)
        println("Transferência sucedida")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferência")
        println(e.message)
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}
