package academy.devdojo.maratonajava.javacore.OString.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William"; //String constant pool // As strings são imutáveis
        /*
         * Há uma piscina em java que guarda  valor inicializado da string
         * a variável apenas aponta para um valor desta piscina.
         * */
        String nome2 = "William";
        System.out.println(nome==nome2); //Compara a referência
        System.out.println(nome.equals(nome2)); //Compara o valor
        nome.concat("Imutável, portanto não vai mudar :(");
        // Isso criará uma nova string no pool de strings com este valor;

        nome = nome.concat(" Agora dá certo"); //nome4 += "Agora dá certo";
        //Cria e adiciona Agora dá certo na piscina, muda a referencia de nome para
        //valor(nome) + agora da certo
        System.out.println(nome);

        System.out.println(nome==nome2); //Compara a referência
        System.out.println(nome.equals(nome2));

        String nome3 = new String("William"); // 1. Variável de referência 2. Objeto String na heal 3.Uma string no pool de strings
        System.out.println(nome2 == nome3);
        //Falso pois o valor fica dentro da heap quando se usa o construtor
        //não dentro do pool de strings
        //esse objeto dentro da heap referencia o valor dentro do pool de strings
        System.out.println(nome2 == nome3.intern());
        //Pega a referencia do valor apontado (dentro do pool)

        String nome5 = "Marcos";
        nome5 = "vai dar muito certo";
        System.out.println(nome5);
    }
}
