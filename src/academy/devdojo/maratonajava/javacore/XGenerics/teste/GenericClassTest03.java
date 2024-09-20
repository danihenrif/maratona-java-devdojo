package academy.devdojo.maratonajava.javacore.XGenerics.teste;

import academy.devdojo.maratonajava.javacore.XGenerics.domain.Carro;
import academy.devdojo.maratonajava.javacore.XGenerics.service.CarroService;
import academy.devdojo.maratonajava.javacore.XGenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("bmw"), new Carro("bmw2")));
        RentalService<Carro> rs = new RentalService<>(carrosDisponiveis);
        Carro carro = rs.retrieveAvaliableCar();
        rs.retornarCarroAlugado(carro);
    }
}
