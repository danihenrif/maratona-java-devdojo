package academy.devdojo.maratonajava.javacore.WColecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Manga1");
        mangas.add("Manga2");
        mangas.add("Manga3");
        mangas.add("Manga5");
        mangas.add("Manga4");
        mangas.add("Manga6");

        Collections.sort(mangas);
        for (String manga : mangas){
            System.out.println(manga);
        }
    }
}
