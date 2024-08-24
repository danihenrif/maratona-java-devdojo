package academy.devdojo.maratonajava.javacore.Blocosdeini.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    /*
    * 1. É alocado um espaço de memória para o objeto
    * 2. Cada atributo de classe é criado e inicializado com os calores (ou default)
    * 3. Bloco de inicialização é executado
    * 4. Construtor é executado
    * */

    /*
    * É executado antes do construtor
    * Agora todos os construtores terão a inicialização do número de episódios
    */

    {
        episodios = new int[100];
        for(int i = 0 ; i < 100 ; i++){
            episodios[i] = i+1;
        }
    }

    /*
    * Caso eu necessitasse usar este construtor e precisasse inicializar os 100 episodios
    * eu usaria blocos de inicialização :), acima ^.^
    */
    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
