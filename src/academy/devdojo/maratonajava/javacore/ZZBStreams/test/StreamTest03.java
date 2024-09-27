package academy.devdojo.maratonajava.javacore.ZZBStreams.test;

import academy.devdojo.maratonajava.javacore.ZZBStreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<LightNovel>(List.of(
            new LightNovel("L1",1.5D),
            new LightNovel("L2", 4D),
            new LightNovel("L3",1D),
            new LightNovel("L4",2D),
            new LightNovel("L5",3.5D)));

    public static void main(String[] args) {
        lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .limit(3)
                .forEach(System.out::println);
        Stream<LightNovel> stream = lightNovels.stream();

        long count = stream.filter(ln -> ln.getPrice() < 4)
                .count();

        System.out.println(count);
    }
}
