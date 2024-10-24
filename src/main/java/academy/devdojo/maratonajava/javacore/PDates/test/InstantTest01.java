package academy.devdojo.maratonajava.javacore.PDates.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        //Parecida com date, mas ao invés de ms trabalha com ns
        //zulu time, hora padrão do mundo
        //útil para salvar horas em banco de dados
        // zulu time - zona
        //ex : são paulo UTC-3
        //=  tempo - 3
        Instant instant = Instant.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(instant);
        System.out.println(localDateTime);
    }
}
