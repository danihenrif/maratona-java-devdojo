package academy.devdojo.maratonajava.javacore.ZComportamento.test;

import academy.devdojo.maratonajava.javacore.ZComportamento.domain.Car;
import academy.devdojo.maratonajava.javacore.ZComportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("green", 2013));

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for(T e : list){
            if(predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }



    public static void main(String[] args) {

        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green")); // arrow function
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red")); // arrow function

        List<Integer> listaInteiros = List.of(1,2,3,4,5,6);
        List<Integer> filteredList = filter(listaInteiros, num -> num % 2 == 0);

        System.out.println(filteredList);

        System.out.println(greenCars);
    }
}
