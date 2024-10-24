package academy.devdojo.maratonajava.javacore.QFormatacao.test;

import java.util.Locale;

public class LocalTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + ", ");
        }
    }
}
