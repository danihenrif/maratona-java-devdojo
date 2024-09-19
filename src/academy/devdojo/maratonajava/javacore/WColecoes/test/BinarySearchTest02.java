package academy.devdojo.maratonajava.javacore.WColecoes.test;

import academy.devdojo.maratonajava.javacore.WColecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class BinarySearchTest02 {

    public static void printMangas(List<Manga> l){
        for (Manga manga : l){
            System.out.println(manga);
        }
    }

    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(1L,"Manga1"));
        mangas.add(new Manga(3L,"Manga2"));
        mangas.add(new Manga(9L,"Manga3"));
        mangas.add(new Manga(7L,"Manga5"));
        mangas.add(new Manga(5L,"Manga6"));

        printMangas(mangas);
        Collections.sort(mangas);
        System.out.println();
        printMangas(mangas);

        Manga mangaToSeacth = new Manga(8L,"Manga7");

        System.out.println(Collections.binarySearch(mangas, mangaToSeacth));


        // (-(ponto de inserção) - 1) - Retorno caso não exista a chave 
    }
}
