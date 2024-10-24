package academy.devdojo.maratonajava.javacore.YClassesInternas.test;

import academy.devdojo.maratonajava.javacore.XGenerics.domain.Carro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CarroNomeComparator implements Comparator<Carro> {
    @Override
    public int compare(Carro o1, Carro o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Carro> carroList = new ArrayList<>(List.of(new Carro("Tesla"), new Carro("Gol")));
        carroList.sort(new Comparator<Carro>() {
            @Override
            public int compare(Carro o1, Carro o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        carroList.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome()));

        carroList.forEach(carro -> System.out.println(carro.getNome()));
    }
}
