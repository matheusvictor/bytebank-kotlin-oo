package br.com.alura.bytebank.modelo

class Endereco(
    var cep: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var logradouro: String = "",
    var complemento: String = ""
) {
    override fun toString(): String =
        """Endereco:
            |cep='$cep',
            |numero=$numero,
            |bairro='$bairro',
            |cidade='$cidade',
            |estato='$estado',
            |logradouro='$logradouro',
            |complemento='$complemento'
        """.trimMargin()

    fun enderecoCompleto(): String {
        return """
            $logradouro, Nº $numero - $bairro. $cidade - $estado
            $cep
            $complemento
        """.trimIndent()
    }
}