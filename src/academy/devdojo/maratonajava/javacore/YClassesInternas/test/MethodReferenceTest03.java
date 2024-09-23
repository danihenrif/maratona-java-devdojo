package academy.devdojo.maratonajava.javacore.YClassesInternas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(List.of("l1", "l2", "l5", "l4"));
        l.sort(String::compareTo); // Não estático chamando a partir do nome da classe
        //só quando é comparable (tem o compareTo, por isso a classe anime não dá)
        System.out.println(l);
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("1"));

        BiPredicate<List<String>, String> checkName = List::contains;

        System.out.println(checkName.test(l, "l1"));
        System.out.println(checkName.test(l, "2l1"));
    }
}
