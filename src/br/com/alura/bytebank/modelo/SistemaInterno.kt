package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha))
            println("Boas-vindas ao ByteBank!")
        else
            println("Falha ao tentar autenticar!")
    }

}
