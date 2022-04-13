abstract class FuncionarioAdmin(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val senha: Int
) {

    abstract val bonificacao: Double

    fun autentica(senha: Int): Boolean = this.senha == senha

}
