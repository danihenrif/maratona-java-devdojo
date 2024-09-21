package academy.devdojo.maratonajava.javacore.ZComportamento.test;

import academy.devdojo.maratonajava.javacore.ZComportamento.domain.Car;
import academy.devdojo.maratonajava.javacore.ZComportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("green", 2013));

    private static List<Car> filter(List<Car> cars, CarPredicate predicate) {
        List<Car> filteredCars = new ArrayList<>();
        for(Car car : cars){
            if(predicate.test(car)){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    public static void main(String[] args) {
        /*List<Car> greenCars = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        });*/

        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green")); // arrow function
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red")); // arrow function

        System.out.println(greenCars);
    }
}
