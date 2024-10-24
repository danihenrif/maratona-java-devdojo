package academy.devdojo.maratonajava.javacore.TIo.test;

import java.io.*;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("arquivo\\file2.txt");

        try(FileReader fr= new FileReader(file);
            BufferedReader br = new BufferedReader(fr, 2048 )) {
            String linha;
            while((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
