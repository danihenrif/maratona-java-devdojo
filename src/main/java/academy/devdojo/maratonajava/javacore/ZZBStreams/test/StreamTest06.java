package academy.devdojo.maratonajava.javacore.ZZBStreams.test;

import academy.devdojo.maratonajava.javacore.ZZBStreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//208.Finding and Matching
public class StreamTest06 {
    private static List<LightNovel> lightNovels = new ArrayList<LightNovel>(List.of(
            new LightNovel("L1",1.5D),
            new LightNovel("L2", 4D),
            new LightNovel("L3",1D),
            new LightNovel("L4",2D),
            new LightNovel("L5",3.5D)));
    //Existe algum light novel com preço maior que 8 ?
    public static void main(String[] args) {
        System.out.println(lightNovels.stream()
                        .anyMatch(l -> l.getPrice() > 8));
        System.out.println(lightNovels.stream().allMatch(l -> l.getPrice() > 0));

        lightNovels.stream()
                .filter(l -> l.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(l -> l.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findFirst()
                .ifPresent(System.out::println);


    }
}
