package academy.devdojo.maratonajava.javacore.PDates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate ldInicio = LocalDate.now();
        LocalDate ldFim = LocalDate.of(2001,03,27);
        System.out.println(Period.between(ldInicio,ldFim));
    }

}
