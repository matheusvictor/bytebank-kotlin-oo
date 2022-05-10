import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

fun main() {

    // uso de higher order functions
    Endereco(logradouro = "Rua dos Bobos", numero = 0)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }
        .let(::println) // invocação da função println por referência, recebendo o retorno do primeiro let como parâmetro

    listOf(
        Endereco(complemento = "Casa"),
        Endereco(),
        Endereco(complemento = "Apartamento")
    )
        .filter { endereco -> endereco.complemento.isNotEmpty() } // lista endereços que possuem complemento
        .let(::println) // invocação da função println por referência, recebendo o retorno do filter (neste caso, lista endereços que possuem complemento)

    soma(1, 5, resultado = { println(it) })

    val exemploAutenticavel = object : Autenticavel {
        val senha: Int = 1234
        override fun autentica(senha: Int): Boolean = this.senha == senha
    }

    SistemaInterno().entra(exemploAutenticavel, 1234)

}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    resultado(a + b)
}
