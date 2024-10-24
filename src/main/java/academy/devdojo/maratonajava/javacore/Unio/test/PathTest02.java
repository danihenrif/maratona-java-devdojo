package academy.devdojo.maratonajava.javacore.Unio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");
        Path pastaDirectory = Files.createDirectories(pastaPath);
        Path subpastaPath = Paths.get("pasta/subpasta");
        Path subpastaDirectory = Files.createDirectories(subpastaPath);

        Path filePath = Paths.get(subpastaPath.toString(), "file.txt");
        if(Files.notExists(filePath)) {
            Path fileCreated = Files.createFile(filePath);
        }

        //Files.createFile(subpastaPath,"arquivo.txt");
    }
}
