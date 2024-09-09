package academy.devdojo.maratonajava.javacore.Aintroducao;

public class Aula31Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Pula para a próxima iteração se o número for par
            }
            System.out.println("Número ímpar: " + i);
        }
    }
}
