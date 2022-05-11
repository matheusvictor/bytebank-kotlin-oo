package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaFuncoesDeEscopo() {
    // uso de higher order functions
    Endereco(logradouro = "Rua dos Bobos", numero = 0)
        .run {
            "$logradouro, $numero".toUpperCase()
        }
        .let { enderecoEmMaiusculo: String ->
            println(enderecoEmMaiusculo)
        }

    listOf(
        Endereco(complemento = "Casa"),
        Endereco(),
        Endereco(complemento = "Apartamento")
    )
        .filter { endereco -> endereco.complemento.isNotEmpty() } // lista endereços que possuem complemento
        .let(::println) // invocação da função println por referência, recebendo o retorno do filter (neste caso, lista endereços que possuem complemento)
}
