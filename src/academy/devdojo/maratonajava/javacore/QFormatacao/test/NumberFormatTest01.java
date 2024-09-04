package academy.devdojo.maratonajava.javacore.QFormatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        NumberFormat[] nfa = new NumberFormat[5];
        Locale locale = new Locale("pt", "BR");
        Locale locale1 = Locale.CANADA;
        Locale locale2 = Locale.GERMANY;
        Locale locale3 = Locale.ENGLISH;
        Locale locale4 = Locale.FRENCH;

        nfa[0] = NumberFormat.getInstance(locale);
        nfa[1] = NumberFormat.getInstance(locale1);
        nfa[2] = NumberFormat.getInstance(locale2);
        nfa[3] = NumberFormat.getInstance(locale3);
        nfa[4] = NumberFormat.getInstance(locale4);

        double valor = 100_513.90;

        for (NumberFormat nf : nfa) {
            System.out.println(nf.format(valor));
        }

        System.out.println();

        nfa[0] = NumberFormat.getCurrencyInstance(locale);
        nfa[1] = NumberFormat.getCurrencyInstance(locale1);
        nfa[2] = NumberFormat.getCurrencyInstance(locale2);
        nfa[3] = NumberFormat.getCurrencyInstance(locale3);
        nfa[4] = NumberFormat.getCurrencyInstance(locale4);

        valor = 100_513.90;

        for (NumberFormat nf : nfa) {
            System.out.println(nf.format(valor));
        }
    }
}
