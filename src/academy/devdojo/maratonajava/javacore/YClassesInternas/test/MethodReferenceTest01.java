package academy.devdojo.maratonajava.javacore.YClassesInternas.test;

import academy.devdojo.maratonajava.javacore.YClassesInternas.domain.Anime;
import academy.devdojo.maratonajava.javacore.YClassesInternas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> anime = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("ABerserk2", 900)));
        //Collections.sort(anime, (a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
        //Collections.sort(anime, (a1,a2) -> AnimeComparators.compareByTitle(a1,a2));
        Collections.sort(anime, AnimeComparators::compareByTitle);
        System.out.println(anime);
    }
}
