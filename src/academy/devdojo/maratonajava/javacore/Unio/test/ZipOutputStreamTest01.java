package academy.devdojo.maratonajava.javacore.Unio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    /*
    * Zipar a saída
    */
    public static void main(String[] args) {
        Path arquivoZipado = Paths.get("pasta/teste.zip");
        Path arquivosToZip = Paths.get("pasta/teste.txt");
        zip(arquivoZipado, arquivosToZip);
    }
    private static void zip(Path arquivoZipado, Path arquivosToZip) {
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZipado));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosToZip)) {
            for (Path file : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file,zipStream);
                zipStream.closeEntry();
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
