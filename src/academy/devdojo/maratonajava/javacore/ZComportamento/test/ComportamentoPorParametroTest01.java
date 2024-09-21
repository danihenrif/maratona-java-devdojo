package academy.devdojo.maratonajava.javacore.ZComportamento.test;

import academy.devdojo.maratonajava.javacore.ZComportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> greenCars = new ArrayList<>();
        for(Car car : cars){
            if(car.getColor().equals(color)){
                greenCars.add(car);
            }
        }
        return greenCars;
    }
    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("green", 2011),
                new Car("black", 1998),
                new Car("green", 2013));
        List<Car> filteredCars = filterCarByColor(cars, "black");
        for (Car car : filteredCars) {
            System.out.println(car.toString());
        }
    }

}
