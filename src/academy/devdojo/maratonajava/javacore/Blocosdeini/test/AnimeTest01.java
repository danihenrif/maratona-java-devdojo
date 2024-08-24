package academy.devdojo.maratonajava.javacore.Blocosdeini.test;

import academy.devdojo.maratonajava.javacore.Blocosdeini.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Nome random");
        for(int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }
}
