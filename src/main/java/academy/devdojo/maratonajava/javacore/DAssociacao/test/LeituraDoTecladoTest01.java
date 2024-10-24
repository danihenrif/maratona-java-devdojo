package academy.devdojo.maratonajava.javacore.DAssociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto = sc.nextLine();
        char sexo = sc.next().charAt(0);

        System.out.println(texto + " " + sexo);
    }
}
