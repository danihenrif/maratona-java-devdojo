package academy.devdojo.maratonajava.javacore.XGenerics.service;

import academy.devdojo.maratonajava.javacore.XGenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T retrieveAvaliableCar(){
        System.out.println("Buscando objetos disponíveis...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto" + t);
        System.out.println("Objetos disponíveis para alugar:");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarCarroAlugado(T t){
        System.out.println("Devolvendo objeto " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponíveis para alugar:");
        System.out.println(objetosDisponiveis);
    }
}
