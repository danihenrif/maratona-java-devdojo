package academy.devdojo.maratonajava.javacore.DAssociacao.test;

import academy.devdojo.maratonajava.javacore.DAssociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.DAssociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor prof = new Professor("Valquiria");
        Professor prof2 = new Professor("Valquiria2");
        Professor[] professores = {prof, prof2};
        Escola escola = new Escola("Escola01", professores);

        escola.imprime();

    }
}
