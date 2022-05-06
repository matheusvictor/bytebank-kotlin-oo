import br.com.alura.bytebank.modelo.Endereco

fun main() {

    // uso de higher order functions
    Endereco(logradouro = "Rua dos Bobos", numero = 0)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }.let(::println) // invocação da função println por referência, recebendo o retorno do primeiro let como parâmetro

    listOf(
        Endereco(complemento = "Casa"),
        Endereco(),
        Endereco(complemento = "Apartamento")
    )
        .filter { endereco -> endereco.complemento.isNotEmpty() } // lista endereços que possuem complemento
        .let(::println) // invocação da função println por referência, recebendo o retorno do filter (neste caso, lista endereços que possuem complemento)
}
