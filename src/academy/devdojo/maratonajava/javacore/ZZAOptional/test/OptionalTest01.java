package academy.devdojo.maratonajava.javacore.ZZAOptional.test;

import java.util.List;
import java.util.Optional;

/*
* Optional foi cruado para evitar NullPointerException
* Ele encapsula outros objetos
* */

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Qualquer texto");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        Optional<String> o4 = Optional.ofNullable(findName("Fernando2"));
        o4 = o4.orElse("EMPTY").describeConstable();
        System.out.println(o4);

        //System.out.println(findName().toLowerCase()); // Nullpointerexceltion
    }

    private static <Optional>String findName(String s) {
        List<String> l = List.of("Daniel", "Fernando");
        int i = l.indexOf(s);
        if (i != -1) return l.get(i);
        return null;
    }
}
