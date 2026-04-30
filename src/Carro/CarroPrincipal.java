package Carro;

public class CarroPrincipal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        System.out.println("--- Teste de Segurança do Carro ---");

        meuCarro.buzinar();

        meuCarro.movimentar();

        System.out.println("\n--- Iniciando Procedimento Correto ---");
        meuCarro.ligar();
        meuCarro.movimentar();
        meuCarro.buzinar();

        System.out.println("------------------------------------");
    }
}