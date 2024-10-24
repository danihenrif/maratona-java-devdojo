package academy.devdojo.maratonajava.javacore.GModificadorFinal.domain;

public class Carro {
    private String nome;
    //Constante, valor não muda durante a exec do código
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
