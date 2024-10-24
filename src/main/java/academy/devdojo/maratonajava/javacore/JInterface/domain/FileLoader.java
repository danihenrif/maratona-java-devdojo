package academy.devdojo.maratonajava.javacore.JInterface.domain;

public class FileLoader implements DataLoader{
    @Override
    public void loadData(){
        System.out.println("Loading data from archive...");
    }
}
