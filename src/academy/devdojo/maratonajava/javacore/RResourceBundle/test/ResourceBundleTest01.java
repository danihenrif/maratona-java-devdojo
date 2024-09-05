package academy.devdojo.maratonajava.javacore.RResourceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        ResourceBundle bundle2 = ResourceBundle.getBundle("messages", new Locale("en", "US"));

        boolean asd = bundle.containsKey("nao vai ter"); //verificar se chave existe
        System.out.println(asd);

        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        System.out.println(bundle2.getString("hello"));
        System.out.println(bundle2.getString("good.morning"));
    }
}
