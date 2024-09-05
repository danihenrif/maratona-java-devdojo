package academy.devdojo.maratonajava.javacore.PDates.test;

import java.time.LocalDate;

public class DateTimeFormatter {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        String toString = now.format(java.time.format.DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(toString);

        //parse = converte de string para objeto
        LocalDate parse1 = LocalDate.parse("20210219", java.time.format.DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);
    }
}
