package academy.devdojo.maratonajava.javacore.MException.test.domain;
import java.io.Closeable;
import java.io.IOException;

public class Leitor1 implements Closeable{
    public void close() throws IOException {
        System.out.println("fechando 1");
    }
}
