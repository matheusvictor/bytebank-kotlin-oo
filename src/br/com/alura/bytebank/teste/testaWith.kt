package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua dos Bobos"
        numero = 0
        bairro = "Em algum lugar"
        cidade = "Ali"
        estado = "Onde"
        cep = "0000-000"
        complemento = "Uma casa muito engraçada"
        enderecoCompleto() // computação que será retornada após a atribuição dos valores ao objeto
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}
