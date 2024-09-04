package academy.devdojo.maratonajava.javacore.PDates.test;

import java.time.LocalDate;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date = LocalDate.of(2024,04,10);
        System.out.println(today);
        System.out.println(date);
        System.out.println(date.lengthOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.isLeapYear());
    }
}
