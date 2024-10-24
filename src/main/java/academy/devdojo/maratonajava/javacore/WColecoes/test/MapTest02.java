package academy.devdojo.maratonajava.javacore.WColecoes.test;

import academy.devdojo.maratonajava.javacore.WColecoes.domain.Consumidor;
import academy.devdojo.maratonajava.javacore.WColecoes.domain.Manga;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Daniel");
        Consumidor c2 = new Consumidor("Danilo");
        System.out.println(c1);

        Set<Manga> mangas = new HashSet<>();
        Manga manga1 = new Manga(1L, "Manga1", 10);
        Manga manga2 = new Manga(3L, "Manga2", 11);
        Manga manga3 = new Manga(9L, "Manga3", 54);
        Manga manga5 = new Manga(7L, "Manga5", 30);
        Manga manga4 = new Manga(7L, "Manga4", 22);
        Manga manga6 = new Manga(5L, "Manga6", 12);
        Manga manga7 = new Manga(5L, "Manga6", 4);

        Map<Consumidor, Manga> consumidores = new HashMap<>();

        consumidores.put(c1, manga1);
        consumidores.put(c2, manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidores.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
