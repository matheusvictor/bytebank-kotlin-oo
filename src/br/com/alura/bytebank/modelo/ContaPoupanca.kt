package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.excecao.SaldoInsuficienteException

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
) {

    override fun transfere(valor: Double, destino: Conta) {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
        } else {
            throw SaldoInsuficienteException()
        }
    }

}
