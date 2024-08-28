package academy.devdojo.maratonajava.javacore.KPolimorfismo.test;

import academy.devdojo.maratonajava.javacore.KPolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.KPolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.KPolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("PC01", 1000F);
        Tomate tomate = new Tomate("T01", 0.5F);
        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
        calculadoraImposto.calculaImpostoComputador(computador);
        calculadoraImposto.calculaImpostoTomate(tomate);
    }
}
