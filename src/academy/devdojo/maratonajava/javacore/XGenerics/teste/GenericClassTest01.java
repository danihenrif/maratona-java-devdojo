package academy.devdojo.maratonajava.javacore.XGenerics.teste;

import academy.devdojo.maratonajava.javacore.XGenerics.domain.Carro;
import academy.devdojo.maratonajava.javacore.XGenerics.service.CarroService;

public class GenericClassTest01 {
    public static void main(String[] args) {
        CarroService cs = new CarroService();
        Carro carro = cs.retrieveAvaliableCar();
        cs.retornarCarroAlugado(carro);
    }
}
