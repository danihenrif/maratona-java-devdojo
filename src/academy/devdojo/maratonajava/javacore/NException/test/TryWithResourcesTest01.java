package academy.devdojo.maratonajava.javacore.NException.test;

import academy.devdojo.maratonajava.javacore.NException.test.domain.Leitor1;
import academy.devdojo.maratonajava.javacore.NException.test.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }
    public static void lerArquivo() {
        //O try with resources se dá conta de internamente fechar os recursos
        try(Leitor1 l1 = new Leitor1();
        Leitor2 l2 = new Leitor2()) {
        //É fechaado na ordem inversa (observar os prints)
        }catch (IOException e){
        }
    }
    public static void lerArquivo2() {
        //O try with resources se dá conta de internamente fechar os recursos
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))) {

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void lerArquivo3(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
    * A sobrescrita de métodos não carrega as exceções
    * */
}
