package academy.devdojo.maratonajava.javacore.JInterface.domain;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void loadData(){
        System.out.println("Loading data from DataBase...");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from DataBase...");
    }
}
