package academy.devdojo.maratonajava.javacore.QFormatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat01 {
    public static void main(String[] args) {
        //Criar formatos de data, consultar documentação
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd 'do' MM 'de' yyyy HH:mm:ss");

        System.out.println(sdf.format(new Date()));
        System.out.println(sdf2.format(new Date()));
        System.out.println(sdf3.format(new Date()));

        try {
            System.out.println(sdf3.parse("04 do 09 de 2024 13:54:40"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}

