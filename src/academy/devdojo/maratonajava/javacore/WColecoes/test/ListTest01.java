package academy.devdojo.maratonajava.javacore.WColecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static <List> void main(String[] args) {
        ArrayList<String> nomes = new ArrayList(300);
        nomes.add("Daniel");
        nomes.add("Dev Dojo Academy");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
