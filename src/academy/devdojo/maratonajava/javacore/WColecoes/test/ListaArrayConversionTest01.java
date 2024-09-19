package academy.devdojo.maratonajava.javacore.WColecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversionTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] integerArrays = numeros.toArray(new Integer[0]);
        //se usar 0 o java usa reflection para descobrir o tamanho do arraylist
        //mas também pode-se usar numeros.size mas é menos eficiente
        System.out.println(Arrays.toString(integerArrays));

        Object[] backToArrayList = Arrays.asList(integerArrays).toArray();
        System.out.println(Arrays.toString(backToArrayList));


    }
}
