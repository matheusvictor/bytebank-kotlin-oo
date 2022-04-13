class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int) {
        if (admin.autentica(senha))
            print("Boas-vindas ao ByteBank!")
        else
            print("Falha na autenticação!")
    }

}
