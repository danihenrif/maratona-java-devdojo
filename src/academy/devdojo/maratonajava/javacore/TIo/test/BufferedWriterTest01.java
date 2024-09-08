package academy.devdojo.maratonajava.javacore.TIo.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    /*
    * A diferença entre `FileWriter` e `BufferedWriter` está na forma
    * como lidam com a gravação de dados. O `FileWriter` escreve diretamente
    *  no arquivo a cada chamada, o que pode ser menos eficiente para muitas
    * pequenas operações. Já o `BufferedWriter` utiliza um buffer interno,
    * armazenando os dados na memória e gravando-os no arquivo de uma só vez,
    *  o que melhora o desempenho em gravações frequentes. No caso do `BufferedWriter`,
    *  é necessário chamar `flush()` ou `close()` para garantir que os dados sejam gravados
    *  corretamente. Ambos podem ser usados em conjunto, mas o `BufferedWriter` é mais
    *  eficiente em cenários com várias escritas.
    *
    * */
    public static void main(String[] args) {
        File file = new File("arquivo\\file2.txt");

        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw, 2048 )) {
            bw.write("Hello World !!!");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
