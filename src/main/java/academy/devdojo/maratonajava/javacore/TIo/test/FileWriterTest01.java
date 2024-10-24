package academy.devdojo.maratonajava.javacore.TIo.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("arquivo\\file2.txt");

        try(FileWriter fw = new FileWriter(file, true)) {
            fw.write("Hello World !!!");
            fw.flush();
            /*
            * O método flush() da classe FileWriter em Java é utilizado para garantir que
            * quaisquer dados armazenados em um buffer sejam efetivamente gravados no arquivo.
            * Quando você escreve dados em um FileWriter, esses dados podem ser armazenados
            * temporariamente em um buffer,em vez de serem gravados imediatamente no disco, para
            * otimizar o desempenho.
            * */
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
