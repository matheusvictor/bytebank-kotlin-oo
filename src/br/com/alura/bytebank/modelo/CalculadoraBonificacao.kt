package br.com.alura.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }

    // função registra recebendo um parâmetro do tipo Any
    /*
        fun registra(funcionario: Any) {
            // o smart cast implementado no if é o que garante que esse Any seja do tipo Funcionario
            if (funcionario is Funcionario)
                this.total += funcionario.bonificacao
        }
     */


}
