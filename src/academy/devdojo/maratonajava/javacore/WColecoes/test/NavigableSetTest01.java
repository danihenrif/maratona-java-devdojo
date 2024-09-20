package academy.devdojo.maratonajava.javacore.WColecoes.test;

import academy.devdojo.maratonajava.javacore.WColecoes.domain.Manga;
import academy.devdojo.maratonajava.javacore.WColecoes.domain.Smartphone;

import java.util.*;

class CompareSmartphone implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class CompareManga implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        // Primeiro, compara pelo ID
        int idComparison = o1.getId().compareTo(o2.getId());
        if (idComparison == 0) {
            return idComparison;
        }
        // Se os IDs forem iguais, compara pela quantidade
        return o1.getQuantidade().compareTo(o2.getQuantidade());
    }
}



public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> navigableSet = new TreeSet<>(new CompareSmartphone());
        Smartphone s1 = new Smartphone("1ABC", "Samsung");
        Smartphone s2 = new Smartphone("2ABC", "Nokia");

        navigableSet.add(s1);
        navigableSet.add(s2);

        //Ou usa uma classe comparator
        // ou a classe tem um compareto e extende o comparable

         // inverte a ordem;

        System.out.println(navigableSet);
        System.out.println(navigableSet.descendingSet());


        NavigableSet<Manga> mangas = new TreeSet<>(new CompareManga());
        mangas.add(new Manga(1L,"Manga1",10));
        mangas.add(new Manga(3L,"Manga2",20));
        mangas.add(new Manga(9L,"Manga3",45));
        mangas.add(new Manga(7L,"Manga5",23));
        mangas.add(new Manga(7L,"Manga4",44));
        Manga m = new Manga(5L,"Manga6",4);
        mangas.add(m);
        mangas.add(new Manga(5L,"Manga6",9));

        System.out.println(mangas);
        //lower <
        System.out.println(mangas.higher(m));
        System.out.println(mangas.last());
        //floor <=
        //higher >
        //ceiling >=
    }
}
