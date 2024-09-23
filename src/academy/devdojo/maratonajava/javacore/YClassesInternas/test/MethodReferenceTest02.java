package academy.devdojo.maratonajava.javacore.YClassesInternas.test;

import academy.devdojo.maratonajava.javacore.YClassesInternas.domain.Anime;
import academy.devdojo.maratonajava.javacore.YClassesInternas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Referência a métodos não estáticos
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> anime = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("ABerserk2", 900)));
        anime.sort(animeComparators::compareByTitleNoneStatic);
        anime.sort((a1,a2) -> animeComparators.compareByTitleNoneStatic(a1,a2));
        System.out.println(anime);
    }
}
