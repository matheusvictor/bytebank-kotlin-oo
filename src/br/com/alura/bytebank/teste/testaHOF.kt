package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaHOF() {

    soma(1, 5, resultado = { valor ->
        println(valor)
    })
    somaReceiver(1, 5, resultado = {
        println(this)
    })

    val exemploAutenticavel = object : Autenticavel {
        val senha: Int = 1234
        override fun autentica(senha: Int): Boolean = this.senha == senha
    }

    SistemaInterno().entra(exemploAutenticavel, 1234)
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    resultado(a + b)
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    val totalSoma = a + b
    totalSoma.resultado()
}

