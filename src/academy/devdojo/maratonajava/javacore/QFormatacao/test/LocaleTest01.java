package academy.devdojo.maratonajava.javacore.QFormatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale locale = new Locale("it", "IT");
        Locale localeSWD = new Locale("it", "CH");
        Calendar calendar = Calendar.getInstance();
        DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.FULL, locale);
        DateFormat dateInstance2 = DateFormat.getDateInstance(DateFormat.FULL, localeSWD);
        System.out.println(dateInstance.format(calendar.getTime()));
        System.out.println(dateInstance2.format(calendar.getTime()));
    }
}
