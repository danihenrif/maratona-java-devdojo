import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroCorreto = 7; // Número que o jogador deve adivinhar
        int tentativa;

        do {
            System.out.print("Adivinhe um número entre 1 e 10: ");
            tentativa = scanner.nextInt();

            if (tentativa != numeroCorreto) {
                System.out.println("Errado! Tente novamente.");
            }
        } while (tentativa != numeroCorreto);

        System.out.println("Parabéns! Você acertou o número.");
        scanner.close();
    }
}
