package academy.devdojo.maratonajava.javacore.ZComportamento.interfaces;

import academy.devdojo.maratonajava.javacore.ZComportamento.domain.Car;

public interface CarPredicate {
    boolean test(Car car);
    //parâmetro -> <expressão>
    // Car car  -> booleano
}
