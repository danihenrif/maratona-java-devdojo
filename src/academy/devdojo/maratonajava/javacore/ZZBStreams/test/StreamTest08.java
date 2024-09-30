package academy.devdojo.maratonajava.javacore.ZZBStreams.test;

import academy.devdojo.maratonajava.javacore.ZZBStreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static List<LightNovel> lightNovels = new ArrayList<LightNovel>(List.of(
            new LightNovel("L1",1.5D),
            new LightNovel("L2", 4D),
            new LightNovel("L3",1D),
            new LightNovel("L4",2D),
            new LightNovel("L5",3.5D)));

    public static void main(String[] args) {
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(x -> x > 3D)
                .reduce(Double::sum)
                .ifPresent(System.out::println);


        //Com mapToDouble é retornado um Double e não mais o Stream<Double>
        //o double tem o m+étodo sum
        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(x -> x > 3D)
                .sum();
        System.out.println(sum);
    }
}
