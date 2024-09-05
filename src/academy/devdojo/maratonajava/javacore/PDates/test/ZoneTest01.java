package academy.devdojo.maratonajava.javacore.PDates.test;

import java.time.*;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        System.out.println(zoneId);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now + "aq");
        ZonedDateTime zoned = now.atZone(zoneId);
        System.out.println(zoned);

        //Ja adiciona as horas
        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        nowInstant.atZone(zoneId);
        System.out.println(nowInstant);

        //Para lugares que por ex não tem uma zona padrão no java
        ZoneOffset offSetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offSetManaus);
        System.out.println(offsetDateTime);

    }
}
