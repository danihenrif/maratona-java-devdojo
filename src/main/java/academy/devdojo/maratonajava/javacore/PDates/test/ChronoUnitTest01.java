package academy.devdojo.maratonajava.javacore.PDates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime nascimento = LocalDateTime.of(2001, Month.MARCH, 3, 11, 30, 0 );
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(nascimento,now));
        System.out.println(ChronoUnit.WEEKS.between(nascimento,now));
        System.out.println(ChronoUnit.MONTHS.between(nascimento,now));
        System.out.println(ChronoUnit.YEARS.between(nascimento,now));
        System.out.println(ChronoUnit.HOURS.between(nascimento,now));
        System.out.println(ChronoUnit.MINUTES.between(nascimento,now));
    }
}
