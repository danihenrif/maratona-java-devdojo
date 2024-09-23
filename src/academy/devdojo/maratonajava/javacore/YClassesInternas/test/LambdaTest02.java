package academy.devdojo.maratonajava.javacore.YClassesInternas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {

    public static void main(String[] args){
        List<String> l = List.of("Nome1", "Nome2", "Nome3");
        List<Integer> integer = map(l, (String s) -> s.length());
        System.out.println(integer);

    }

    private static <T,R> List<R> map(List <T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for (T e: list){
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
