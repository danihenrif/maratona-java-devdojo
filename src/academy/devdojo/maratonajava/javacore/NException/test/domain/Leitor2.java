package academy.devdojo.maratonajava.javacore.NException.test.domain;

import java.io.Closeable;
import java.io.IOException;

public class Leitor2 implements Closeable {
    public void close() throws IOException{
        System.out.println("fechando 2");
    }
}
