package academy.devdojo.maratonajava.javacore.KPolimorfismo.service;

import academy.devdojo.maratonajava.javacore.KPolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.KPolimorfismo.domain.Product;
import academy.devdojo.maratonajava.javacore.KPolimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public void calculaImpostoComputador(Computador computador){
        computador.calculaImposto();
    }
    public void calculaImpostoTomate(Tomate tomate){
        tomate.calculaImposto();
    }

    public static void calculaImposto(Product product){
        if(product instanceof Tomate){
            System.out.println("Calculando imposto de tomate...");
        }
        else if(product instanceof Computador){
            System.out.println("Calculando imposto de computador...");
        }
    }
}
