fun main() {

//    testaTipoFuncaoReferencia()

    val minhaFuncaoLambda: (Int, Int) -> Int =
        { a, b -> a + b } // em funções lambdas a última expressão equivale ao retorno da função
    println(minhaFuncaoLambda(20, 20))

    /*
        Obs. Em funções lambdas, o _ recebido como parâmetro significa que aquele parâmetro em específico
        não será usado na função
    */

    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a, b): Int { // função anônima
        println("Executa como função anônima")
        return a + b
    }
    println(minhaFuncaoAnonima(1, 1))

    val calculaBonificacaoFuncaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50.0
        }
        return salario + 100.0
    }

    println(calculaBonificacaoFuncaoAnonima(1000.0))
    println(calculaBonificacaoFuncaoAnonima(1100.0))

    val calculaBonificacaoLambda: (salario: Double) -> Double = funcaoLambda@{ salario ->
        if (salario > 1000.0) {
            return@funcaoLambda salario + 50.0
        }
        return@funcaoLambda salario + 100.0
    }

    println(calculaBonificacaoLambda(1000.0))
    println(calculaBonificacaoLambda(1100.0))

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
