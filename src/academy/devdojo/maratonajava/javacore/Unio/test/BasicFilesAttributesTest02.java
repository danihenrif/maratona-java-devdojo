package academy.devdojo.maratonajava.javacore.Unio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFilesAttributesTest02 {
    public static void main(String[] args) throws IOException {
        BasicFileAttributes basicFileAttributes;
        DosFileAttributes dosFileAttributes; //Mais voltado para o windows
        PosixFileAttributes posixFileAttributes;//PAra unix

        Path path = Paths.get("pasta2/novo.txt");
        BasicFileAttributes bfa = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime fileTimeCreation = bfa.creationTime();
        FileTime fileTimeLastAcess = bfa.lastAccessTime();
        FileTime fileTimeLastModified = bfa.lastModifiedTime();

        System.out.println(fileTimeCreation + "\n" +  fileTimeLastAcess + "\n" + fileTimeLastModified);

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime now = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(fileTimeLastModified, now, fileTimeCreation);

        fileTimeCreation = fileAttributeView.readAttributes().creationTime();
        fileTimeLastAcess = fileAttributeView.readAttributes().lastAccessTime();
        fileTimeLastModified = fileAttributeView.readAttributes().lastModifiedTime();
        System.out.println(fileTimeCreation + "\n" +  fileTimeLastAcess + "\n" + fileTimeLastModified);
    }
}
