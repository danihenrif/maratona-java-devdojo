package academy.devdojo.maratonajava.javacore.GModificadorFinal.test;

import academy.devdojo.maratonajava.javacore.GModificadorFinal.domain.Carro;


public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR.getNome());
        carro.COMPRADOR.setNome("Qualquer");
        System.out.println(carro.COMPRADOR.getNome());
    }
}
