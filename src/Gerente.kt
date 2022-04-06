class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome,
    cpf,
    salario
) {

    fun autentica(senha: Int): Boolean {
        return false
    }

    override val bonificacao: Double
        get() {
            return this.salario * 0.2
        }

}
