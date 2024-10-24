package academy.devdojo.maratonajava.javacore.Aintroducao;

public class Aula29Break {
    public static void main(String[] args) {
        int var = 50;
        for (int i = 1; i <= var ; i++) {
            if(i>25){
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
