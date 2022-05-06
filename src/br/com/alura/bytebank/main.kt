fun main() {

    testaTipoFuncaoReferencia()

//    val minhaFuncaoLambda = {
//        println("O bloco de código do lambda é executado")
//    }
//    println(minhaFuncaoLambda())
//
//    val minhaFuncaoAnonima: () -> Unit = fun() { // função anônima
//        println("Executa como função anônima")
//    }
//    println(minhaFuncaoAnonima())
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma() // como Classe já trabalham com referência, não usa-se o ::
    println("Execução da função (chamada do invoke): ${minhaFuncaoClasse(2, 2)}")
}

fun testaTipoFuncaoReferencia() {
    /*
        Variável do tipo função:
        a inicialização de uma variável do tipo função precisa ser "assinada" a partir de uma
        função já existente e que seja compatível com a assinatura da função existente.

        :: indica a referência da função a ser usada. Isto é, isso não indica a execução função, mas sim a assinatura
    */

    val minhaFuncao: (Int, Int) -> Int = ::somar
    println(minhaFuncao) // imprime o tipo da variável minhaFuncao
    println(minhaFuncao(5, 10)) // "executa" a variável
}

fun somar(a: Int, b: Int): Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b
}
