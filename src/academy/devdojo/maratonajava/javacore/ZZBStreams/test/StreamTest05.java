package academy.devdojo.maratonajava.javacore.ZZBStreams.test;

import java.util.ArrayList;
import java.util.List;

//Flat map é para propriedades aninhadas
public class StreamTest05 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("gD1", "gD2", "gD3", "gD4", "gD5", "gD6");
        List<String> developers = List.of("d1", "d2", "d3", "d4", "d5", "d6");
        List<String> students = List.of("s1", "s2", "s3", "s4", "s5", "s6");

        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);



    }
}
