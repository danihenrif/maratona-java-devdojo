package academy.devdojo.maratonajava.javacore.ZZBStreams.test;

import academy.devdojo.maratonajava.javacore.ZZBStreams.domain.LightNovel;
import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

//Flat map é para propriedades aninhadas
public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("gD1", "gD2", "gD3", "gD4", "gD5", "gD6");
        List<String> developers = List.of("d1", "d2", "d3", "d4", "d5", "d6");
        List<String> students = List.of("s1", "s2", "s3", "s4", "s5", "s6");

        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        /*for (List<String> people : devdojo){
            for (String person : people){
                System.out.println(person);
            }
        }*/

        devdojo.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
        //.flatMap(l -> l.stream())
    }
}
