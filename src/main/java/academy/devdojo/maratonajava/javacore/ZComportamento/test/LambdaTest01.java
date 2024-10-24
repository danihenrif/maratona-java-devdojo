package academy.devdojo.maratonajava.javacore.ZComportamento.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Daniel", "Daniel2", "Daniel3");
        forEach(strings, (String s) -> System.out.println());
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
