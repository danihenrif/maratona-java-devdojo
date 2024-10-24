package academy.devdojo.maratonajava.javacore.Unio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvePathTest03 {
    public static void main(String[] args) {
        Path p1 = Paths.get("home/daniel");
        Path p2 = Paths.get("daniel/dev"); //Não existe na raiz
        Path resolve = p2.resolve(p2);//para resolver
        System.out.println(resolve);
    }
}
