import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    // Instância a partir de uma especialização de br.com.alura.bytebank.modelo.FuncionarioAdmin
    val gerente = Gerente(
        nome = "Matheus",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 123
    )

    val diretora = Diretor(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 456,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "João",
        cpf = "999.999.999-99",
        senha = 1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 123)
    sistema.entra(diretora, 123) // falha
    sistema.entra(diretora, 456) // sucesso
    sistema.entra(cliente, 1234) // sucesso
}
