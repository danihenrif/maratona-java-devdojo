package academy.devdojo.maratonajava.javacore.Unio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizePathTest04 {
    public static void main(String[] args) {
        //Como faço para chegar do path 1 até o path 2 ?
        Path dir = Paths.get("/home/daniel");
        Path path = Paths.get("/home/daniel/Qualquercoisa/maiscoisa");

        System.out.println(dir.relativize(path));
    }
}
