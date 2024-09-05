package academy.devdojo.maratonajava.javacore.SRegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    /*
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
        /*
        * Desta forma, um hexadecimal 0xFF13 só retornará 0xF, como resolver ?
        * Quantificadores, próxima aula.
        * Resolução :
        * */
        String regex = "0[xX][0-9A-Fa-f]+(\\s|$)";
        //da forma que está : 0XFFGABCD reconheceria OXFF (que não é hexadecimal, não é o completo)
        //solução : String regex = "0[xX][0-9A-Fa-f]+(?![A-Za-z0-9])";; lookahead negativa
        /*
        *  "[a-zA-Z\\w]"
        *  "a[xX][0-9A-Fa-f]" //hexadecimais
        * solução incompleta : "0[xX]([0-9A-Fa-f])*"
        * soluções completas :
        *   1. "0[xX][0-9A-Fa-f]+(?![A-Za-z0-9])"
        *   2. "0[xX][0-9A-Fa-f]+(\\s|$)"
        */

        String texto = "12 0x 0X 0XFFGABCD 0x10FEA 0X10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while(matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
