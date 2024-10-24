package academy.devdojo.maratonajava.javacore.ZZEdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZEdesignpatterns.domain.AirCraft;
import academy.devdojo.maratonajava.javacore.ZZEdesignpatterns.domain.AirCraftSingletonEager;

public class AirCraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");

        bookSeat2("1A");
        bookSeat2("1A");
    }

    private static void bookSeat(String seat){
        AirCraft airCraft = new AirCraft();
        System.out.println(airCraft.bookSeat(seat));
    }

    private static void bookSeat2(String seat){
        AirCraftSingletonEager instance = AirCraftSingletonEager.getInstance();
        System.out.println(instance.bookSeat(seat));
    }

}
