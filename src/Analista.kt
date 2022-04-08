class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome,
    cpf,
    salario
) {

    override val bonificacao: Double
        get() {
            return (this.salario * 0.10) + this.salario
        }

}
