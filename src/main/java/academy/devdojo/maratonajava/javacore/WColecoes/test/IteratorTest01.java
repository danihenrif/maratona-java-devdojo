package academy.devdojo.maratonajava.javacore.WColecoes.test;

import academy.devdojo.maratonajava.javacore.WColecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(1L,"Manga1", 1));
        mangas.add(new Manga(3L,"Manga2",0));
        mangas.add(new Manga(9L,"Manga3",3));
        mangas.add(new Manga(7L,"Manga5",0));
        mangas.add(new Manga(7L,"Manga4",3));
        mangas.add(new Manga(5L,"Manga6",4));

        /*Iterator<Manga> iterator = mangas.iterator();
        while (iterator.hasNext()) {
            Manga manga = iterator.next();
            if(manga.getQuantidade() == 0){
                iterator.remove();
            }
        }*/

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
