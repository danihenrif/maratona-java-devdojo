package academy.devdojo.maratonajava.javacore.SRegex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Nome, Nome2, Nome3, 200, true";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while(scanner.hasNext()) {
            if(scanner.hasNextInt()) {
                System.out.println("Integer" + scanner.nextInt());
            }
            else if(scanner.hasNextBoolean()) {
                System.out.println("Boolean" + scanner.nextBoolean());
            }
            else {
                System.out.println(scanner.next().trim());
            }
        }

    }


}
