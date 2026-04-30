package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        boolean opcaoValida = false;

        System.out.println("=== CALCULADORA ===");


        while (!opcaoValida) {
            System.out.println("\n1. Somar (+)");
            System.out.println("2. Subtrair (-)");
            System.out.println("3. Multiplicar (*)");
            System.out.println("4. Dividir (/)");
            System.out.print("Escolha uma operação (1-4): ");


            if (leitor.hasNextInt()) {
                opcao = leitor.nextInt();


                if (opcao >= 1 && opcao <= 4) {
                    opcaoValida = true;
                } else {
                    System.out.println(">> Erro: Opção inválida! Escolha um número entre 1 e 4.");
                }
            } else {
                System.out.println(">> Erro: Por favor, digite apenas números.");
                leitor.next();
            }
        }


        System.out.print("Digite o primeiro número: ");
        double n1 = leitor.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = leitor.nextDouble();

        System.out.print("\nResultado: ");

        switch (opcao) {
            case 1 -> System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
            case 2 -> System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
            case 3 -> System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
            case 4 -> {
                if (n2 != 0) {
                    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                } else {
                    System.out.println("Erro: Divisão por zero não permitida!");
                }
            }
        }

        leitor.close();
        System.out.println("\nCalculadora encerrada com sucesso.");
    }
}
