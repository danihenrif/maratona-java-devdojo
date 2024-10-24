package academy.devdojo.maratonajava.javacore.ZZEdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZEdesignpatterns.domain.Country;
import academy.devdojo.maratonajava.javacore.ZZEdesignpatterns.domain.CurrenceFactory;
import academy.devdojo.maratonajava.javacore.ZZEdesignpatterns.domain.Currency;

public class CurrencyFactoryTest {
    public static void main(String[] args) {
        Currency currency = CurrenceFactory.newCurrency(Country.BRAZIL);
    }
}
