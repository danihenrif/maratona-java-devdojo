package academy.devdojo.maratonajava.javacore.JInterface.domain;

public interface DataRemover {

    //Todos os atributos em interface são estáticos e constantes
    public String str = "tenho acesso na classe que implementa";

    public abstract void remove();

    /*
    * Método que não necessita ser implementado em todas as
    * classes que implementem a interface.
    */
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões...1");
    }
}
