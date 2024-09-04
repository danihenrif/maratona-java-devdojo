package academy.devdojo.maratonajava.javacore.PDates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate ld = LocalDate.parse("04-09-2024");
        System.out.println(ld);
        System.out.println(localDateTime);
    }
}
