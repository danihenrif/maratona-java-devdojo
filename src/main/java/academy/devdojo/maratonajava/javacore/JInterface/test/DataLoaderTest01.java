package academy.devdojo.maratonajava.javacore.JInterface.test;

import academy.devdojo.maratonajava.javacore.JInterface.domain.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.JInterface.domain.DataLoader;
import academy.devdojo.maratonajava.javacore.JInterface.domain.FileLoader;

import javax.xml.crypto.Data;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.loadData();
        dataBaseLoader.remove();
        dataBaseLoader.checkPermission();
        System.out.println(DataBaseLoader.str);
        fileLoader.loadData();
    }
}
