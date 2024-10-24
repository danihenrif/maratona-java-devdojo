package academy.devdojo.maratonajava.javacore.WColecoes.test;

import academy.devdojo.maratonajava.javacore.WColecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1AABC","Apple");
        Smartphone s2 = new Smartphone("1AABC","Samsung");
        Smartphone s3 = new Smartphone("1AABC","Motorola");

        List<Smartphone> smartphones = new ArrayList<Smartphone>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for(Smartphone smartphone : smartphones) {
            System.out.println(smartphone.toString());
        }
    }
}
