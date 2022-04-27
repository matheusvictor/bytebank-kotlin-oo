package br.com.alura.bytebank.modelo

class Endereco(
    var cep: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var estato: String = "",
    var logradouro: String = "",
    var complemento: String = ""
){
    override fun toString(): String =
        """Endereco:
            |cep='$cep',
            |numero=$numero,
            |bairro='$bairro',
            |cidade='$cidade',
            |estato='$estato',
            |logradouro='$logradouro',
            |complemento='$complemento'
        """.trimMargin()
}