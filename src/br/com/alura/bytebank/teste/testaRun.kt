package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaRun() {
    val taxaAnual = (5 / 100.0)
    val taxaMensal = taxaAnual / 12

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Matheus", cpf = "111.111.111-11", senha = 1234), numero = 1000)

    contaPoupanca
        .run {
            deposita(1000.0)
            saldo * taxaMensal
        }.let { rendimentoMensal ->
            println("Rendimento mensal: R$ $rendimentoMensal")
        }

    val rendimentoAnual = run {
        var saldoAtual = contaPoupanca.saldo
        repeat(12) {
            saldoAtual += saldoAtual * taxaMensal
        }
        saldoAtual
    }.let { rendimentoAnual ->
        println("Simulação de rendimento anual: R$ $rendimentoAnual")
    }
}
