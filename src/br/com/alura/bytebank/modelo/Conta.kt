package br.com.alura.bytebank.modelo

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) : Autenticavel {
    var saldo = 0.0
        protected set

    companion object Contador {
        var totalContasCriadas: Int = 0
            private set
    }

    // esse bloco de código será executado sempre que for feita uma instância de Conta
    init {
        println("Criando uma conta...")
        totalContasCriadas++
    }

    fun deposita(valor: Double) {
        if (valor > 0) this.saldo += valor
    }

    open fun saca(valor: Double) {
        if (this.saldo >= valor) this.saldo -= valor
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

}
