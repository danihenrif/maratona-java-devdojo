package academy.devdojo.maratonajava.javacore.SRegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    /*
    * \\d = todos os dígitos
    * \\D = tudo o que não for dígito
    * \\s = todos os espaços em branco (\t \n \f \r)
    * \\S = complementar do \\s
    * \\w = "a-ZA-Z" e "_"
    * \\W = complementar de \\w
    */
    public static void main(String[] args) {
        //Linguagem desenvolvida para reconhecer padrões
        // Como saber se o campo q o usuário digtou é um email ?
        // Como saber se a senha digitada corresponde aos critérios de senha.
        String regex = "ab";
        String regex2 = "\\w";
        String texto = "aaabaxrbaab_";
        Pattern pattern = Pattern.compile(regex);
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(texto);
        Matcher matcher2 = pattern2.matcher(texto);

        while(matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }

        System.out.println();

        while(matcher2.find()) {
            System.out.println(matcher2.start() + " " + matcher2.group());
        }

    }
}
