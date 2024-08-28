package academy.devdojo.maratonajava.javacore.KPolimorfismo.domain;

public class Tomate extends Product implements Taxavel{
    public Tomate(String nome, Float valor) {
        super(nome, valor);
    }

    @Override
    public void calculaImposto() {
        System.out.println("Calculando taxa de tomate...");
    }
}
