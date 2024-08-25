package academy.devdojo.maratonajava.javacore.CModificadorEstatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    /*
    *----------------- Independente de objeto---------------------------------------
    * 0. Bloco de inicialização estático é carregado quando  a JVM carrega a classe
    * ---------------- Dependentes de objeto ---------------------------------------
    * 1. É alocado um espaço de memória para o objeto
    * 2. Cada atributo de classe é criado e inicializado com os calores (ou default)
    * 3. Bloco de inicialização é executado
    * 4. Construtor é executado
    * */

    /*
    * É executado antes do construtor
    * Agora todos os construtores terão a inicialização do número de episódios
    */

    /*
    * Há um desperdício de processamento em toda vez que os episódios são inicializados
    * quando criada um novo objeto, como solução o uso de blocos de inicialização estáticos :)
    * Ele é executado apenas uma vez e independente da criação de instância, quando a classe é executava pela jvm
    */
    static{
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

    public Anime() {
        for(int episodio : Anime.episodios){
            System.out.println(episodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
