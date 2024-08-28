package academy.devdojo.maratonajava.javacore.KPolimorfismo.test;

import academy.devdojo.maratonajava.javacore.KPolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.KPolimorfismo.domain.Product;
import academy.devdojo.maratonajava.javacore.KPolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.KPolimorfismo.service.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        /*Product produto = new Computador("Ryzen 9", 2000F);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());

        Product produto2 = new Tomate("T01", 0.5F);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());*/

        Product produto2 = new Tomate("T01", 0.5F);
        Product produto = new Computador("Ryzen 9", 2000F);

        CalculadoraImposto.calculaImposto(produto);
        CalculadoraImposto.calculaImposto(produto2);
    }
}
