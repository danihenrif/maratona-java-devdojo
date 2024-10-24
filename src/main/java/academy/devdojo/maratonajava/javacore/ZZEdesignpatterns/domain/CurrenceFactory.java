package academy.devdojo.maratonajava.javacore.ZZEdesignpatterns.domain;

public class CurrenceFactory {
    public static Currency newCurrency(Country country){
        switch(country){
            case EUA : return new Dolar();
            case BRAZIL : return new Real();
            default: throw new IllegalArgumentException("No currency found for this country");
        }
    }
}
