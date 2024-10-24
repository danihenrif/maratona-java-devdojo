package academy.devdojo.maratonajava.javacore.SRegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    /*
    * regexr.com
    * \\d = todos os dígitos
    * \\D = tudo o que não for dígito
    * \\s = todos os espaços em branco (\t \n \f \r)
    * \\S = complementar do \\s
    * \\w = "a-ZA-Z" e "_"
    * \\W = complementar de \\w
    * [] = range de caracteres, vide texto3, regex3
    * ? Zero ou uma
    * * Zero ou mais
    * + Uma ou mais
    * {n-m} n até m (1-13)
    * | toma(te|da) - > tomate ou tomada
    * $ fim da linha
    * . 1.3 = qualquer coisa entre 1 e 3, ex : 1£3 1$3 1{3
    */
    public static void main(String[] args) {
        //Linguagem desenvolvida para reconhecer padrões
        // Como saber se o campo q o usuário digtou é um email ?
        // Como saber se a senha digitada corresponde aos critérios de senha.
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.[a-zA-Z]+)+";

        String texto = "danielhrqs4@hotmail.com, outroemail@.com, maisum@mail.com, teste@gmail.com, valido@gmail.com.br";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        //Verificar se é válido
        System.out.println("#naovaiservalido@naovalido.com.br".matches(regex));

        while(matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
