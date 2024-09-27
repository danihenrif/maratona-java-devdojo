package academy.devdojo.maratonajava.javacore.ZZAOptional.repository;

import academy.devdojo.maratonajava.javacore.ZZAOptional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(3, "Titulo", 603), new Manga(4, "Titulo2", 603));

    private static Optional<Manga> findBy(Predicate<Manga> predicate) {
        for (Manga manga : mangas) {
            if(predicate.test(manga)){
                return Optional.of(manga);
            }
        }
        return null;
    }

    public static Optional<Manga> findById(Integer id) {
        return findBy(m -> m.getId() == id);
    }
    public static Optional<Manga> findByTitle(String title) {
        return findBy(m -> m.getTitle().equals(title));
    }
}
