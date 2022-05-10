package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, autenticado: () -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Boas-vindas ao ByteBank!")
            autenticado()
        } else
            println("Falha ao tentar autenticar!")
    }

}
