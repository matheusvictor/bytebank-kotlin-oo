package br.com.alura.bytebank.modelo

abstract class ContaTransferivel(
    titular: String, numero: Int
) : Conta(titular, numero) {

    abstract fun transfere(valor: Double, destino: Conta): Boolean

}
