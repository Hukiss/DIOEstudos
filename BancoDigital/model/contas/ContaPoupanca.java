package model.contas;

import model.Cliente;

public class ContaPoupanca extends ContaBancaria {
    private double taxaDeJuros;

    public ContaPoupanca(long numeroConta, Cliente cliente, double saldo) {
        super(numeroConta, cliente, saldo);
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public void renderJuros() {
        saldo += saldo * taxaDeJuros;
    }

    @Override
    public String toString() {
        return String.format("%n%s%nSaldo: %.2f%n", super.cliente, saldo);
    }
}
