package academy.devdojo.maratonajava.javacore.TIo.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File diretorio = new File("diretorio");
        diretorio.mkdir();

        //File arquivoDiretorio = new File("C:\\Users\\Daniel\\Documents\\github\\maratona-java-devdojo\\diretorio\\arquivo.txt");
        File arquivoDiretorio = new File(diretorio,"arquivoDiretorio.txt");
        arquivoDiretorio.createNewFile();

        File arquivoRenomeado = new File(diretorio,"arquivoRenomeado.txt");
        arquivoDiretorio.renameTo(arquivoRenomeado);

        File diretorioRenomeado = new File("diretorioRenomeado");
        diretorio.renameTo(diretorioRenomeado);
    }
}
