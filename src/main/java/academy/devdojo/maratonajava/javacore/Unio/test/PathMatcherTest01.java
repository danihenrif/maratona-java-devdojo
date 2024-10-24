package academy.devdojo.maratonajava.javacore.Unio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    /*
    * Criada para facilitar a busca de paths.
    */
    public static void main(String[] args) {
        Path path = Paths.get("home/daniel/file.bkp");
        Path path1 = Paths.get("pasta/teste.txt");
        Path path2 = Paths.get("pasta2/novo.txt");
        Path path3 = Paths.get(".");

        matches(path, "glob:**/*.{bkp,java,txt}");//busca todos os .bkp, .java e .txt
        matches(path1, "glob:**/*.{bkp,java,txt}");//busca todos os .bkp, .java e .txt
        matches(path2, "glob:**/*.{bkp,java,txt}");//busca todos os .bkp, .java e .txt

        matches(path3, "glob:**/*.{bkp,java,txt}");//busca todos os .bkp, .java e .txt
        matches(path3, "glob:**/*.???");//busca todos os .bkp, .java e .txt

        matches(path1, "glob:**/*.???");//a extensão tem que ter 3 letras


    }

    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:"+glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
