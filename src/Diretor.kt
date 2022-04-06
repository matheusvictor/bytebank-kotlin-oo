class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
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
            return this.salario * 0.3
        }

}
