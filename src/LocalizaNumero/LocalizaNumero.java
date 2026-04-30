package LocalizaNumero;

import java.util.Scanner;

public class LocalizaNumero {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("=== BUSCA DE NÚMEROS ===");
        System.out.print("Qual número você deseja procurar no vetor? ");
        int numeroProcurado = leitor.nextInt();

        boolean achou = false;
        int posicaoEncontrada = -1;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroProcurado) {
                achou = true;
                posicaoEncontrada = i;
                break;
            }
        }

        if (achou) {
            System.out.println("\nAchei!");
            System.out.printf("O número %d está localizado na posição %d do vetor.\n", numeroProcurado, posicaoEncontrada);
        } else {
            System.out.println("\nNúmero não encontrado no vetor.");
        }

        leitor.close();
    }
}