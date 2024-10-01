package academy.devdojo.maratonajava.javacore.ZZBStreams.test;

import academy.devdojo.maratonajava.javacore.ZZBStreams.domain.LightNovel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Gerar stream diretamente sem necessidade de listas
public class StreamTest09 {
    public static void main(String[] args) {
        //IntStream.range(1,50) vai de 1 a 49
        //IntStream.rangeCloser(1,50) vai de 1 a 50
        IntStream.rangeClosed(1,50).filter(n -> n % 2 == 0).forEach(n -> System.out.println(n + " "));
        System.out.println(IntStream.range(1,50).filter(n -> n % 2 == 0));

        Stream<String> string1 = Stream.of("String1", "String2", "String3", "String4", "String5");
        string1.map(String::toUpperCase)
                .forEach(System.out::println);

        int num[] = {1,2,3,4,5};
        IntStream stream = Arrays.stream(num);
        stream.average()
                .ifPresent(System.out::println);

        try(Stream<String> lines = Files.lines(Paths.get("arquivo/teste.txt"))){
            lines.filter(x -> x.contains("Java"))
                    .forEach(System.out::println);

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
