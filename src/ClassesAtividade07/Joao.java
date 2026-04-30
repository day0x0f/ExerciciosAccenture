package ClassesAtividade07;

public class Joao {
    String nome = "João";

    public void morar(Casa casa) {
        System.out.println(nome + " está descansando em sua casa no endereço: " + casa.endereco);
    }

    public void dirigir(Carro carro) {
        System.out.print(nome + " assumiu o volante. ");
        carro.ligarMotor();
    }
}