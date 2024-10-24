package academy.devdojo.maratonajava.javacore.DAssociacao.dominio;

public class Time {
    /*
     * O banco de dados cuida dessas inconsistências, aqui posso ter barcelona com cafu
     * e em cafu(Jogador) posso ter outro time associado a ele.
     */
    private String nome;
    private Jogador[] jogadores;


    public void imprime(){
        System.out.println(nome);
        if (jogadores != null) {
            for (Jogador jogador : jogadores) {
                System.out.println(jogador.getNome());
            }
        }
    }

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
