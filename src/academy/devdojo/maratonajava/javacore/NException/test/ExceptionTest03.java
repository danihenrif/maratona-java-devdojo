package academy.devdojo.maratonajava.javacore.NException.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest03 {
    public static void main(String[] args) {
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            System.out.println("Fechando o recurso do so");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("Fechando o recurso do so");
        }
    }
}
