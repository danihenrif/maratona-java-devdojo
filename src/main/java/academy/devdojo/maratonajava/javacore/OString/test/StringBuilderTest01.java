package academy.devdojo.maratonajava.javacore.OString.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Daniel";
        nome.concat("apenas na piscina");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder(16);
        sb.append("Daniel");
        sb.append("nao aloca na piscina, por isso mais rapido");
        System.out.println(sb);
    }
}
