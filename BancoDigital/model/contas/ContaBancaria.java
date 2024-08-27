package model.contas;

import model.Cliente;

public abstract class ContaBancaria {

    protected long numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public double getSaldo() { return saldo; }
    public Cliente getCliente() { return cliente; }
    public long getNumeroConta() { return numeroConta; }

    public void setNumeroConta(long numeroConta) {
        if (numeroConta <= 0)
            throw new IllegalArgumentException("não podem existir model.contas com número negativo");
        this.numeroConta = numeroConta;
    }

    public ContaBancaria(long numeroConta, Cliente cliente, double saldo) {
        this.setNumeroConta(numeroConta);
        this.setCliente(cliente);
        this.setSaldo(saldo);
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Cliente cliente) {
        if (cliente == null)
            throw new IllegalArgumentException("cliente não pode ser null");
        this.cliente = cliente;
    }

    //acrescenta o valor de deposito ao saldo atual da conta.
    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}
