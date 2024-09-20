package academy.devdojo.maratonajava.javacore.YClassesInternas.test;

class Animal{
    public void walk(){
        System.out.println("animal andando");
    }
}
public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        //subclass anônima de animal
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Anonymous waml");
            }
        };
        animal.walk();
    }
}
