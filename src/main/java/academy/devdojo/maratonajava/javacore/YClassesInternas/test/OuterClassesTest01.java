package academy.devdojo.maratonajava.javacore.YClassesInternas.test;

public class OuterClassesTest01 {
    //Uma classe dentro da outra
    //Muito útil para interfaces gráficas
    //Somente b acessa os atributos de a : motivo para existir
    private String name = "Nome" ;

    class InnerClass{
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
        }
    }
    public static void main(String[] args) {
        OuterClassesTest01 oc = new OuterClassesTest01();
        oc.new InnerClass().printOuterClassAttribute();
    }
}
