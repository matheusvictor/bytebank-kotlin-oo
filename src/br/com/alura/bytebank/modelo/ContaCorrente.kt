package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.excecao.FalhaAutenticacaoException
import br.com.alura.bytebank.excecao.SaldoInsuficienteException

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double) {
        val valorComTaxa: Double = valor + 0.10
        if (this.saldo >= valorComTaxa) this.saldo -= valorComTaxa
    }

    override fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
        } else {
            throw SaldoInsuficienteException()
        }

        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }

    }

}
