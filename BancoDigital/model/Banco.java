package model;

import model.contas.ContaBancaria;
import model.contas.ContaCorrente;
import model.contas.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class Banco {


    private String nome;
    private List<Cliente> clientes = new ArrayList<>();
    private List<ContaBancaria> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public ContaBancaria criarConta(Cliente cliente, String tipo) {
        ContaBancaria conta = null;
        if (tipo.equals("corrente")) {
            conta = new ContaCorrente(contas.size() + 1, cliente, 20000.0);
        } else if (tipo.equals("poupança")) {
            conta = new ContaPoupanca(contas.size() + 1, cliente, 5000.02);
        }
        contas.add(conta);
        return conta;
    }

    public ContaBancaria consultarConta(long numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}
