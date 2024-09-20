package academy.devdojo.maratonajava.javacore.XGenerics.teste;

import academy.devdojo.maratonajava.javacore.XGenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        System.out.println(criarArrayComUmObjeto(new Carro("bmw")));

    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        List<T> list = new ArrayList<T>();
        list.add(t);
        return list;


    }
}
