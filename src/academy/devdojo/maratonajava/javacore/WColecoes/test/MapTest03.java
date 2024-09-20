package academy.devdojo.maratonajava.javacore.WColecoes.test;

import academy.devdojo.maratonajava.javacore.WColecoes.domain.Consumidor;
import academy.devdojo.maratonajava.javacore.WColecoes.domain.Manga;

import java.util.*;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Daniel");
        Consumidor c2 = new Consumidor("Danilo");
        System.out.println(c1);

        List<Manga> mangas = new ArrayList<>();
        Manga manga1 = new Manga(1L, "Manga1", 10);
        Manga manga2 = new Manga(3L, "Manga2", 11);
        Manga manga3 = new Manga(9L, "Manga3", 54);
        Manga manga5 = new Manga(7L, "Manga5", 30);
        Manga manga4 = new Manga(7L, "Manga4", 22);
        Manga manga6 = new Manga(5L, "Manga6", 12);
        Manga manga7 = new Manga(5L, "Manga6", 4);

        mangas.add(manga1);
        mangas.add(manga2);

        Map<Consumidor, List<Manga>> consumidores = new HashMap<>();

        consumidores.put(c1, mangas);
        //consumidores.put(c2, manga4);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidores.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidores.entrySet()){
            System.out.println(entry.getKey());
            for (Manga manga : entry.getValue()){
                System.out.println(manga.getNomeManga());
            }
        }
    }
}
