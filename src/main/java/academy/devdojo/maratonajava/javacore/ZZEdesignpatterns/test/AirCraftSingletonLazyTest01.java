package academy.devdojo.maratonajava.javacore.ZZEdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZEdesignpatterns.domain.AirCraftSingletonEager;
import academy.devdojo.maratonajava.javacore.ZZEdesignpatterns.domain.AirCraftSingletonLazy;


public class AirCraftSingletonLazyTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("2A");
        System.out.println(AirCraftSingletonLazy.getInstance());
        System.out.println(AirCraftSingletonLazy.getInstance());
    }

    private static void bookSeat(String seat){
        System.out.println(AirCraftSingletonLazy.getInstance());
        AirCraftSingletonLazy aircraft = AirCraftSingletonLazy.getInstance();
        System.out.println(aircraft.bookSeat(seat));
    }
}
