package academy.devdojo.maratonajava.javacore.WColecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(5);
        numeros.add(7);
        numeros.add(10);

        System.out.println(numeros);
        System.out.println(Collections.binarySearch(numeros, 2));

        // (-(ponto de inserção) - 1) - Retorno caso não exista a chave
    }
}
