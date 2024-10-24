package academy.devdojo.maratonajava.javacore.YClassesInternas.test;

public class OuterClassesTest02 {
    //Uma classe dentro da outra
    //Muito útil para interfaces gráficas
    //Somente b acessa os atributos de a : motivo para existir
    private String name = "Nome" ;

    void print(){ // //um parametro aqui tambem deve ser final
        //se for usar uma variavel aqui na classe local ela tem q ser final
        //se n definir final o java trata como final
        class DentrodoDoMetodo{
           public void printLocal(){
               System.out.println(name);
           }
       }
        DentrodoDoMetodo dentro = new DentrodoDoMetodo();
        dentro.printLocal();
    }
    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
