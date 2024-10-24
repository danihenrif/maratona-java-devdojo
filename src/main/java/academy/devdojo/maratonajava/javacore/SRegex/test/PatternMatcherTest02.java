package academy.devdojo.maratonajava.javacore.SRegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    /*
    * \\d = todos os dígitos
    * \\D = tudo o que não for dígito
    * \\s = todos os espaços em branco (\t \n \f \r)
    * \\S = complementar do \\s
    * \\w = "a-ZA-Z" e "_"
    * \\W = complementar de \\w
    * [] = range de caracteres, vide texto3, regex3
    */
    public static void main(String[] args) {
        //Linguagem desenvolvida para reconhecer padrões
        // Como saber se o campo q o usuário digtou é um email ?
        // Como saber se a senha digitada corresponde aos critérios de senha.
        /*
        * Desta forma, um hexadecimal 0xFF13 só retornará 0xF, como resolver ?
        * Quantificadores, próxima aula.
        * */
        String regex = "[a-zA-Z\\w]";
        /*
        *  "[a-zA-Z\\w]"
        *  "a[xX][0-9A-Fa-f]" //hexadecimais
        */

        String texto = "aaabaxrbaab_";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while(matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
