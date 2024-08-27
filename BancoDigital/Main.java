import model.Banco;
import model.Cliente;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.printf("%n%s%n%s%nNome: ","Preencha o formulario","------------------------------");
            String nome = input.nextLine();

            System.out.print("Endereço: ");
            String endereco = input.nextLine();

            System.out.print("CPF: ");
            String cpf = input.next();

            System.out.print("Contacto: ");
            String telefone = input.next();

            Cliente cliente = new Cliente(nome, endereco, cpf, telefone);
            Banco banco = new Banco("BFA");

            System.out.printf("%n%s%n%s%n%s%n%s%n","---Escolha e escreva o tipo de conta---","1.corrente","2.poupança","Tipo de conta:");
            String tipo = input.next();

            banco.criarConta(cliente, tipo);

            banco.consultarConta(1).sacar(500.0);
            banco.consultarConta(1).depositar(38007.65);


            System.out.println(banco.consultarConta(1).toString());
        } catch (IllegalArgumentException e) {
            System.out.printf("Exceção: %s", e.getMessage());
        } finally {
            input.close();
        }
    }
}
