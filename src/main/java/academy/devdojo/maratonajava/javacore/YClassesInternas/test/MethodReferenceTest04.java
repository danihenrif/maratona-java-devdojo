package academy.devdojo.maratonajava.javacore.YClassesInternas.test;

import academy.devdojo.maratonajava.javacore.YClassesInternas.domain.Anime;
import academy.devdojo.maratonajava.javacore.YClassesInternas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

//Referência a construtor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = () -> new AnimeComparators();
        Supplier<AnimeComparators> newAnimeComparators2 = AnimeComparators::new;

        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> anime = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("ABerserk2", 900)));
        anime.sort(animeComparators::compareByTitleNoneStatic);

        System.out.println(anime);

        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;

        System.out.println(animeBiFunction.apply("Daniel", 10));
    }
}
