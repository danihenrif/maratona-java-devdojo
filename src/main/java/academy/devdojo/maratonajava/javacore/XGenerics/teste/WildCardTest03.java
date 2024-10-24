package academy.devdojo.maratonajava.javacore.XGenerics.teste;


import java.util.List;

public class WildCardTest03 {
    public static void main(String[] args) {
        List<Cachorro> ca = List.of(new Cachorro(), new Cachorro());
        List<Gato> ga = List.of(new Gato(), new Gato());
        printConsulta(ca);
        printConsulta(ga);
    }
    /*
    * Para adicionar em uma lista list.add
    * posso adicionar o subtipo
    * mas para receber como parametro não posso ter uma lista de subtipo
    * por causa do type erasure
    * resposta em WildCardTest03
    * */

    //animal ou filho
    private static void printConsulta(List<? extends Animal> as) {
        for (Animal a : as) {
            a.consulta();
        }
    }
    //animal ou pai
    //Lista de animal ou Object
    /*private static void printConsultaAnimalESuper(List<? super Animal> as) {
        for (Animal a : as) {
            a.consulta();
        }
    }*/
    //Cachorro ou pai
    //Cachorro ou animal ou object

    /*
    * O problema:
    *   Ao declarar for (Animal a : as), você está assumindo que todos os elementos da lista
    * são de tipo Animal, mas isso não é garantido. A lista pode ser um List<Object>, onde
    * os elementos não são necessariamente instâncias de Animal.
    * Por isso, o compilador não permite essa iteração com Animal, pois List<? super Cachorro>
    * apenas garante que você pode adicionar elementos do tipo Cachorro ou de suas subclasses,
    * mas não garante que a lista possa ser iterada como se todos os elementos fossem Animal.
    * */
    private static void printConsultaAnimalESuper(List<? super Cachorro> as) {
//        for (Animal a : as) {
//            a.consulta();
//        }
    }
}
