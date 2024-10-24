package academy.devdojo.maratonajava.javacore.ZZEdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZEdesignpatterns.domain.Pessoa;
import academy.devdojo.maratonajava.javacore.ZZEdesignpatterns.domain.Pessoa2;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa.PessoaBuilder()
                .firstName("Daniel")
                .lastName("Fernando")
                .username("danielhdas")
                .email("danielsdauh@hotmail.com")
                .build();

        System.out.println(p1.toString());

        Pessoa2.nome = "ezequiel";
        Pessoa2.nome = "ezequiel2";

        String nome = "Daniel";
        String nome2 = "Nome2";
        nome += "Daniel2";
        nome = nome2;


        System.out.println(Pessoa2.nome);
        System.out.println(nome);
    }

}
