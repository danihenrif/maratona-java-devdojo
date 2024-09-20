package academy.devdojo.maratonajava.javacore.XGenerics.teste;

import academy.devdojo.maratonajava.javacore.WColecoes.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List lista = new ArrayList<>();
        lista.add(123L);
        lista.add("item3");
        lista.add(new Consumidor("c1"));

        for (Object o : lista) {
            System.out.println(o);
        }
    }
}
