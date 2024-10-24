package academy.devdojo.maratonajava.javacore.ZZEdesignpatterns.domain;

import java.util.HashSet;
import java.util.Set;

public class AirCraftSingletonEager {
    private static final AirCraftSingletonEager INSTANCE = new AirCraftSingletonEager("787-900");
    private Set<String> avalibleSeats = new HashSet<>();
    private String name;

    {
        avalibleSeats.add("1A");
        avalibleSeats.add("2A");
        avalibleSeats.add("3");
    }

    private AirCraftSingletonEager(String name) {
        this.name = name;
    }

    public boolean bookSeat(String seat){
        return avalibleSeats.remove(seat);
    }

    public static AirCraftSingletonEager getInstance() {
        return INSTANCE;
    }
}
