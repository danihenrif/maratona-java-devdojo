package academy.devdojo.maratonajava.javacore.Unio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileAttributeView;

public class DosFileAttributeTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/teste.txt");

        if(Files.notExists(path)) {
            Files.createFile(path);
            Files.setAttribute(path, "dos.hidden", true);
            Files.setAttribute(path, "dos.readonly", true);

            boolean hidden = Files.isHidden(path);
            boolean readable = Files.isReadable(path);

            System.out.println(hidden);
            System.out.println(readable);

             DosFileAttributeView fav = Files.getFileAttributeView(path, DosFileAttributeView.class);
             fav.setHidden(false);
        }
    }
}
