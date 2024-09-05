package academy.devdojo.maratonajava.javacore.SRegex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Nome, Nome2, Nome3";
        String[] split = texto.split(",");
        for (String s : split){
            System.out.println(s.trim());
        }
    }


}
