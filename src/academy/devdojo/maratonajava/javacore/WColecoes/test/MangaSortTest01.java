package academy.devdojo.maratonajava.javacore.WColecoes.test;

import academy.devdojo.maratonajava.javacore.WColecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByNameComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getNomeManga().compareTo(o2.getNomeManga());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(1L,"Manga1"));
        mangas.add(new Manga(3L,"Manga2"));
        mangas.add(new Manga(9L,"Manga3"));
        mangas.add(new Manga(7L,"Manga5"));
        mangas.add(new Manga(7L,"Manga4"));
        mangas.add(new Manga(5L,"Manga6"));
        Collections.sort(mangas);
        System.out.println(mangas);
        Collections.sort(mangas, new MangaByNameComparator());
        System.out.println(mangas);


    }
}
