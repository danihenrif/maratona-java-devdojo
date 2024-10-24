package academy.devdojo.maratonajava.javacore.ZZEdesignpatterns.domain;

import java.util.HashSet;
import java.util.Set;

public final class AirCraft {
    private final Set<String> avalibleSeats = new HashSet<>();
    {
        avalibleSeats.add("1A");
        avalibleSeats.add("1B");
        avalibleSeats.add("1C");
        avalibleSeats.add("1D");
    }

    public boolean bookSeat(String seat){
        return avalibleSeats.remove(seat);
    }
}
