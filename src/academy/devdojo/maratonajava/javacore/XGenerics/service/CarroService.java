package academy.devdojo.maratonajava.javacore.XGenerics.service;

import academy.devdojo.maratonajava.javacore.XGenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("bmw"), new Carro("bmw2")));

    public Carro retrieveAvaliableCar(){
        System.out.println("Buscando carro disponível...");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro" + carro);
        System.out.println("Carros disponíveis para alugar:");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo carro " + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponíveis para alugar:");
        System.out.println(carrosDisponiveis);
    }
}
