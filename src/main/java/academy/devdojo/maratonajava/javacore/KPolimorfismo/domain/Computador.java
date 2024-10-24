package academy.devdojo.maratonajava.javacore.KPolimorfismo.domain;

public class Computador extends Product implements Taxavel{
    public Computador(String nome, Float valor) {
        super(nome, valor);
    }

    @Override
    public void calculaImposto() {
        System.out.println("Calculando taxa de computador...");
    }
}
