package academy.devdojo.maratonajava.javacore.TIo.test;

import java.io.File;
import java.io.IOException;
import java.time.ZoneId;
import java.time.Instant;
import java.util.Date;

public class FileTest01  {
    public static void main(String[] args) {
        File file = new File("arquivo\\file.txt");
        try {
            //boolean idDeleted = file.delete();
            //System.out.println(idDeleted);

            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            System.out.println("path: " + file.getPath());
            System.out.println("absolute path: " + file.getAbsolutePath());
            System.out.println("directory? " + file.isDirectory());
            System.out.println("can read? " + file.canRead());
            System.out.println("can write? " + file.canWrite());
            System.out.println("last modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
