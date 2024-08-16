import parametroexception.ParametrosInvalidosException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        boolean contiua = false;

        do {
            try {

                System.out.println("Digite o primeiro parâmetro");
                int parametroUm = scanner.nextInt();
                System.out.println("Digite o segundo parâmetro");
                int parametroDois = scanner.nextInt();

                contar(parametroUm, parametroDois);
                contiua = false;

            } catch (ParametrosInvalidosException e) {
                System.out.printf("Exceção: %s", e.getMessage());
                contiua = true;
                System.out.println("\nTenta novamente!\n");
            } catch (InputMismatchException e) {
                System.err.println("Erro: Os parametros inseridos devem ser números inteiros");
                scanner.nextLine();
                contiua = true;
                System.out.println("Tenta novamente!\n");
            }
        } while (contiua);

        scanner.close();
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException
    {
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        int contagem = parametroDois - parametroUm;
         for (int i = 1; i <= contagem; i++)
         {
             System.out.print("\nImprimindo o número " + i);
        }
    }
}
