package academy.devdojo.maratonajava.javacore.PDates.test;

import java.util.Calendar;

public class CalendarTest01 {
    public static void main(String[] args) {
        System.out.println(Calendar.getInstance());
        Calendar c = Calendar.getInstance();
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("domingueira");
        }
        c.add(Calendar.DAY_OF_MONTH, 2);
        System.out.println(c.getTime());

    }
}
