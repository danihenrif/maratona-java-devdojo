package academy.devdojo.maratonajava.javacore.XGenerics.teste;


import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> ca = List.of(new Cachorro(), new Cachorro());
        List<Gato> ga = List.of(new Gato(), new Gato());
        //printConsulta(ca);
        //printConsulta(ga);
    }
    /*
    * Para adicionar em uma lista list.add
    * posso adicionar o subtipo
    * mas para receber como parametro não posso ter uma lista de subtipo
    * por causa do type erasure
    * resposta em WildCardTest03
    * */


    private static void printConsulta(List<Animal> as) {
        for (Animal a : as) {
            a.consulta();
        }

    }
}
