package academy.devdojo.maratonajava.javacore.Unio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
    /*
     * Listar arquivos - pega apenas o primeiro nível
     * Se eu quisess ver níveis mais internos ? chamadas recursivas de Directory Stream (custoso)
     * Solução : SimpleFileVisitor
     *
     * */
    public static void main(String[] args) {
        Path dir = Paths.get(".");
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for(Path path : stream){
                System.out.println(path.getFileName());
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
