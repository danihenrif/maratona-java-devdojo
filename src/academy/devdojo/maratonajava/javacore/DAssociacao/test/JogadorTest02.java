package academy.devdojo.maratonajava.javacore.DAssociacao.test;

import academy.devdojo.maratonajava.javacore.DAssociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.DAssociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Menino ney");
        Time time = new Time("Selação brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
