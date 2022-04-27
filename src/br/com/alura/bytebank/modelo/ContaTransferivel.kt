package br.com.alura.bytebank.modelo

abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int
) : Conta(titular, numero) {

    abstract fun transfere(valor: Double, destino: Conta, senha: Int)

}
