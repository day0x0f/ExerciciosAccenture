package PrincipalAnimals;

public class PrincipalAnimais {
    public static void main(String[] args) {
        Gato meuGato = new Gato("Tom", 3);
        Dog meuDog = new Dog("Rex", 5);

        System.out.println("--- Sons dos Animais ---");

        meuGato.emitirSom();
        meuDog.emitirSom();

        System.out.println("------------------------");
    }
}
