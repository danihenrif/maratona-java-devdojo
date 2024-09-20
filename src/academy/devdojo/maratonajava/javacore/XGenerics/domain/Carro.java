package academy.devdojo.maratonajava.javacore.XGenerics.domain;

public class Carro {
    private String nome;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Carro(String nome) {
        this.nome = nome;
    }
}
