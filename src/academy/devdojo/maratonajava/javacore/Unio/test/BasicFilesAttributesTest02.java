package academy.devdojo.maratonajava.javacore.Unio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFilesAttributesTest02 {
    public static void main(String[] args) throws IOException {
        BasicFileAttributes basicFileAttributes;
        DosFileAttributes dosFileAttributes; //Mais voltado para o windows
        PosixFileAttributes posixFileAttributes;//PAra unix

        LocalDateTime now = LocalDateTime.now().minusDays(10);
        File file = new File("pasta2/novo.txt");
        file.createNewFile();

        file.setLastModified(now.toInstant(ZoneOffset.UTC).toEpochMilli());
    }
}
