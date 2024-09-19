package academy.devdojo.maratonajava.javacore.WColecoes.test;

import academy.devdojo.maratonajava.javacore.WColecoes.domain.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(1L,"Manga1"));
        mangas.add(new Manga(3L,"Manga2"));
        mangas.add(new Manga(9L,"Manga3"));
        mangas.add(new Manga(7L,"Manga5"));
        mangas.add(new Manga(7L,"Manga4"));
        mangas.add(new Manga(5L,"Manga6"));
        mangas.add(new Manga(5L,"Manga6"));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
