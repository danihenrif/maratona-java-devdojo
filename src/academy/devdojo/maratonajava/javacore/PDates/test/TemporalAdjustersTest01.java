package academy.devdojo.maratonajava.javacore.PDates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalDate now = ld.plusDays(2); //interfere em mes ano (soma)
        LocalDate nowPlusOne = now.with(ChronoField.DAY_OF_MONTH,1);// não interfere em mes ano, apenas substitui
        LocalDate nowPlusOneSecoondWay = now.withDayOfMonth(1);// não interfere em mes ano, apenas substitui
        LocalDate proxQuarta = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        //Há vários metodos
        //primeiro dia do mes, primeiro dia do prox ano, ultimo dia do pro mes, etc.
        System.out.println(ld);
        System.out.println(now);
        System.out.println(nowPlusOne);
        System.out.println(proxQuarta);
    }
}
