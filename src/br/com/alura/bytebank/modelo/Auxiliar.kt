package br.com.alura.bytebank.modelo

class Auxiliar(
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
            return (this.salario * 0.05) + this.salario
        }

}
