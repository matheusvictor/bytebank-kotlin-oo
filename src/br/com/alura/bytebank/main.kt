fun main() {

    /*
        Variável do tipo função:
        a inicialização de uma variável do tipo função precisa ser "assinada" a partir de uma
        função já existente e que seja compatível com a assinatura da função existente.

        :: indica a referência da função a ser usada. Isto é, isso não indica a execução função, mas sim a assinatura
    */

    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao) // imprime o tipo da variável minhaFuncao
    println(minhaFuncao()) // "executa" a variável

    val minhaFuncaoClasse = MinhaClasseComTipoFuncao() // como Classe já trabalham com referência, não usa-se o ::
    println("Referência da classe do tipo função: $minhaFuncaoClasse")
    println("Execuçaõ da função: ${minhaFuncaoClasse()}")

}

fun teste() {
    println("Executa função de teste")
}

class MinhaClasseComTipoFuncao : () -> Unit {

    override fun invoke() {
        println("Executa invoke da MinhaClasseComTipoFuncao")
    }

}
