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

    fun autentica(senha: Int): Boolean = this.senha == senha

    override val bonificacao: Double
        get() {
            return super.bonificacao + this.salario + this.plr
        }

}
