package ClassesAtividade07;

public class CenaAtividade7 {
    public static void main(String[] args) {
        Joao joao = new Joao();
        Casa minhaCasa = new Casa();
        Carro meuCarro = new Carro();
        Arvore arvoreNoQuintal = new Arvore();

        System.out.println("--- Simulação da Atividade 7 ---");

        joao.morar(minhaCasa);
        joao.dirigir(meuCarro);

        System.out.println("Ao lado da cena, há um belo " + arvoreNoQuintal.tipo + ".");
        System.out.println("---------------------------------");
    }
}