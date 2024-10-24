package academy.devdojo.maratonajava.javacore.YClassesInternas.test;

public class OuterClassesTest03  {
    private String name = "Daniel";//outra classe top class
    static class NestedClass {//outra classe top class
        private String lastName = "Henri";
        void print(){
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        new NestedClass().print();
    }
}
