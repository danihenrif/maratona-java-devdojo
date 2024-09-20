package academy.devdojo.maratonajava.javacore.XGenerics.teste;

abstract class Animal {
    public abstract void consulta();
}
class Cachorro extends Animal{
    @Override
    public void consulta() {
        System.out.println("Cachorro");
    }
}
class Gato extends Animal{
    @Override
    public void consulta() {
        System.out.println("Gato");
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {
        Cachorro[] ca = {new Cachorro(), new Cachorro()};
        Gato[] g = {new Gato(), new Gato()};
        printConsulta(ca);
        printConsulta(g);
    }

    private static void printConsulta(Animal[] as) {
        for (Animal a : as) {
            a.consulta();
        }

    }
}
