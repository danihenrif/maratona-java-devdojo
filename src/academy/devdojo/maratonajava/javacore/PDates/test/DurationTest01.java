package academy.devdojo.maratonajava.javacore.PDates.test;

import java.time.*;

public class DurationTest01 {
    //Quantidade de tempo intervalo entre duas
    //Baseados em segundos e ns
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime nowAfther2Years = localDateTime.now().plusYears(2);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);

        System.out.println(Duration.between(timeNow, timeMinus7Hours));
        System.out.println(Duration.between(localDateTime, nowAfther2Years));

        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(360));
        Duration d4 = Duration.between(LocalDateTime.now(), LocalDateTime.of(2001, Month.MARCH, 27, 11, 30));
        System.out.println(d3);
        System.out.println(d4);
    }
}
