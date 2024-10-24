package academy.devdojo.maratonajava.javacore.ZZAOptional.test;

import academy.devdojo.maratonajava.javacore.ZZAOptional.domain.Manga;
import academy.devdojo.maratonajava.javacore.ZZAOptional.repository.MangaRepository;

public class OptionalTest02 {
    public static void main(String[] args) {
        Manga byId = MangaRepository.findById(4).orElseThrow(IllegalArgumentException::new);
        Manga byTitle = MangaRepository.findByTitle("Nao existe").orElse(
                new Manga(7, "Agora existe", 32));

        Manga byTitle2 = MangaRepository.findByTitle("Nao existe").orElseGet(
                () -> new Manga(7, "Agora existe", 32));
        System.out.println(byId);
    }
}
