package academy.devdojo.maratonajava.javacore.WColecoes.test;

import academy.devdojo.maratonajava.javacore.WColecoes.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        String nome = "Daniel Henri";
        String nome2 = "Daniel Henri"; //mesmo pool de strings
        String nome3 = new String("Daniel Henri");
        System.out.println(nome == nome2);
        System.out.println(nome == nome3);
        System.out.println(nome.equals(nome2));

        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "iPhone");

        System.out.println(s1.equals(s2));
    }

}
