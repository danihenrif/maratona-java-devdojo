package academy.devdojo.maratonajava.javacore.YClassesInternas.service;

import academy.devdojo.maratonajava.javacore.YClassesInternas.domain.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }
    public int compareByTitleNoneStatic(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }
}
