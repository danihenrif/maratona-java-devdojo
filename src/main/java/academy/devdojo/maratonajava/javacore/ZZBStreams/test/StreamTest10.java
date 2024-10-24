package academy.devdojo.maratonajava.javacore.ZZBStreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Gerar stream infinits
public class StreamTest10 {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);
        //Stream.generate()0
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10) // Limitar para os primeiros 10 números de Fibonacci
                .forEach(n -> System.out.println(n[0]));
    }
}
