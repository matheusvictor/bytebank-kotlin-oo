package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.excecao.FalhaAutenticacaoException
import br.com.alura.bytebank.excecao.SaldoInsuficienteException

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
) {

    override fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
        } else {
            throw SaldoInsuficienteException(
                mensagem = "O saldo é insuficiente, pois o saldo atual é de R$ ${saldo} e você tentou transferir R$ ${valor}"
            )
        }

        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }
        
    }

}
