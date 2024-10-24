package academy.devdojo.maratonajava.javacore.MException.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        //Excessão do tipo checked
        File file = new File("arquivo/teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("is criado: " + isCriado);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
