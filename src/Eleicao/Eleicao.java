//package sef.module3.activity;

import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candidatoA = 0, candidatoB = 0, brancos = 0, nulos = 0, totalVotos = 0, contadorB = 0;
        int voto;

        do {
            System.out.println("\n=== SISTEMA DE VOTAÇÃO ===");
            System.out.println("1 -> Candidato A");
            System.out.println("2 -> Candidato B");
            System.out.println("3 -> Branco");
            System.out.println("0 -> Encerrar Votação");
            System.out.print("\nDigite seu voto (Qualquer outro número anula): ");

            voto = scanner.nextInt();

            // Atividade 3.1: Refatoração de Switch para IF
            if (voto == 0) {
                System.out.println("Processando resultados...\n");
            }
            else if (voto == 1) {
                candidatoA++;
            }
            else if (voto == 2) {
                contadorB++;
                // Mantendo a lógica de anulação a cada 3 votos
                if (contadorB % 3 != 0) {
                    candidatoB++;
                } else {
                    nulos++;
                    System.out.println("(!) Regra de Auditoria: Terceiro voto no Candidato B anulado.");
                }
            }
            else if (voto == 3) {
                brancos++;
            }
            else {
                // Equivalente ao 'default' do switch
                nulos++;
                System.out.println("Voto computado como NULO.");
            }

        } while (voto != 0);

        totalVotos = candidatoA + candidatoB + brancos + nulos;

        if (totalVotos > 0) {
            exibirResultados(totalVotos, candidatoA, candidatoB, brancos, nulos);
        } else {
            System.out.println("Nenhum voto foi registrado.");
        }

        scanner.close();
    }

    // Criatividade e Eficiência: Método auxiliar para não poluir o main
    private static void exibirResultados(int total, int a, int b, int br, int nu) {
        System.out.println("---------- RESULTADO FINAL ----------");
        System.out.printf("Total de Votos: %d\n", total);
        System.out.printf("Candidato A: %d (%.2f%%)\n", a, (a * 100.0) / total);
        System.out.printf("Candidato B: %d (%.2f%%)\n", b, (b * 100.0) / total);
        System.out.printf("Brancos:     %d (%.2f%%)\n", br, (br * 100.0) / total);
        System.out.printf("Nulos:       %d (%.2f%%)\n", nu, (nu * 100.0) / total);
        System.out.println("-------------------------------------");
    }
}