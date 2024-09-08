package academy.devdojo.maratonajava.javacore.TIo.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("arquivo\\teste3.txt");
        try {
            file.createNewFile();
            FileReader fr = new FileReader(file);
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
