class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int) {
        if (admin.autentica(senha))
            println("Boas-vindas ao ByteBank, ${admin.nome}!")
        else
            println("Falha ao tentar autenticar usuário(a) ${admin.nome}!")
    }

}
