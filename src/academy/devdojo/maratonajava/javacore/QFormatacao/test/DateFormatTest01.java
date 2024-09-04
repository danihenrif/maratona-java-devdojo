package academy.devdojo.maratonajava.javacore.QFormatacao.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance(); // 03/09/2024 14:32
        df[1] = DateFormat.getDateInstance();// 3 de set. de 2024
        df[2] = DateFormat.getDateTimeInstance(); // 3 de set. de 2024 14:32:21
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT); // 03/09/2024
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);// 3 de set. de 2024
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);// 3 de setembro de 2024
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);// terça-feira, 3 de setembro de 2024
        for(DateFormat d : df){
            System.out.println(d.format(calendar.getTime()));
        }
        System.out.println(calendar);
    }
}
