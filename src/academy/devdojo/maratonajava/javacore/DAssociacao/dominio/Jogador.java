package academy.devdojo.maratonajava.javacore.DAssociacao.dominio;

public class Jogador {
    private String nome;

    public void imprime(){
        System.out.println(nome);
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
