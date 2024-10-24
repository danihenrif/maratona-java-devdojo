package academy.devdojo.maratonajava.javacore.Unio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\Daniel\\Documents\\github\\maratona-java-devdojo\\arquivo\\teste.txt");
        System.out.println(p1.getFileName().toString());
    }
}
