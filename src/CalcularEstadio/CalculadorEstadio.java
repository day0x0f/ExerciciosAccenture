import java.util.Scanner;

public class CalculadorEstadio {
    public static void main(String[] args) {
        // Criando o scanner para ler a entrada
        Scanner leitor = new Scanner(System.in);

        // Definição de Preços
        int precoA = 50;
        int precoB = 30;
        int precoC = 20;

        System.out.println("--- Sistema de Vendas do Estádio ---");

        // Entrada de dados
        System.out.print("Quantidade vendida da Classe A (R$ 50): ");
        int qtdA = leitor.nextInt();

        System.out.print("Quantidade vendida da Classe B (R$ 30): ");
        int qtdB = leitor.nextInt();

        System.out.print("Quantidade vendida da Classe C (R$ 20): ");
        int qtdC = leitor.nextInt();

        // Cálculo da Receita
        int totalA = qtdA * precoA;
        int totalB = qtdB * precoB;
        int totalC = qtdC * precoC;
        int receitaTotal = totalA + totalB + totalC;

        // Exibição do Resultado
        System.out.println("\n--- Resumo Financeiro ---");
        System.out.println("Receita Classe A: R$ " + totalA);
        System.out.println("Receita Classe B: R$ " + totalB);
        System.out.println("Receita Classe C: R$ " + totalC);
        System.out.println("--------------------------");
        System.out.println("RENDA TOTAL GERADA: R$ " + receitaTotal);

        leitor.close();
    }
}