package Carro;

public class Carro {
    private boolean ligado = false;
    private boolean emMovimento = false;

    public void ligar() {
        this.ligado = true;
        System.out.println("O carro foi ligado.");
    }

    public void movimentar() {
        if (ligado) {
            this.emMovimento = true;
            System.out.println("O carro está se movimentando agora...");
        } else {
            System.out.println("Erro: Não é possível se movimentar com o carro desligado!");
        }
    }

    public void buzinar() {
        if (emMovimento) {
            System.out.println("Beep Beep! (Buzina acionada)");
        } else {
            System.out.println("Aviso: O carro está parado. A buzina só funciona em movimento.");
        }
    }
}