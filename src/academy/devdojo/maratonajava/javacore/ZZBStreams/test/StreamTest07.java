package academy.devdojo.maratonajava.javacore.ZZBStreams.test;

import java.util.List;
import java.util.Optional;

//Reduce, resultado único a partir de uma coleção de elementos
public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        /*integers.stream()
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println);*/
        integers.stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        integers.stream()
                .reduce(Integer::max)
                .ifPresent(System.out::println);
    }
}
