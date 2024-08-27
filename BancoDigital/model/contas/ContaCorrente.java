package model.contas;

import model.Cliente;

public final class ContaCorrente extends ContaBancaria {

    private double limite;

    public ContaCorrente (long numeroConta, Cliente cliente, double saldo) {
        super(numeroConta, cliente, saldo);
        this.setLimite(limite);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if (limite < 0.0)
            throw new IllegalArgumentException("limite não pode ser nulo");
        this.limite = limite;
    }

    public void usarLimite(double valor) {
        if (valor <= (saldo + limite)) {
            saldo -= valor;
        } else {
            System.out.println("Limite insuficiente.");
        }
    }

    @Override
    public String toString() {
        return String.format("%n%s%nSaldo: %.2f%n", super.cliente, saldo);
    }
}
