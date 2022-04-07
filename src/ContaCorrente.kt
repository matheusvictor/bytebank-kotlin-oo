class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double) {
        val valorComTaxa: Double = valor + 0.10
        super.saca(valorComTaxa)
    }

}
