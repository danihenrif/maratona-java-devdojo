package academy.devdojo.maratonajava.javacore.ZZEdesignpatterns.domain;

import java.util.HashSet;
import java.util.Set;

public class AirCraftSingletonLazy {
    private static AirCraftSingletonLazy INSTANCE;
    private Set<String> avalibleSeats = new HashSet<>();
    private String name;

    {
        avalibleSeats.add("1A");
        avalibleSeats.add("2A");
        avalibleSeats.add("3");
    }

    public static AirCraftSingletonLazy getInstance() {
        if (INSTANCE == null) {
            synchronized (AirCraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AirCraftSingletonLazy("787-900");
                }
            }
        }
        return INSTANCE;
    }

    private AirCraftSingletonLazy(String name) {
        this.name = name;
    }

    public boolean bookSeat(String seat){
        return avalibleSeats.remove(seat);
    }
}
