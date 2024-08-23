package academy.devdojo.maratonajava.introducao;

public class Aula323334353637Array {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 20;
        idades[1] = 30;
        idades[2] = 40;

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
        //////////////////////////////////////////////
        int [] numeros = {1,2,3,4,5};  //mesma coisa da linha de baixo
        int [] numeros2 = new int[]{1,2,3,4,5}; //diff = posso usar como argumento de método
        /*
        * Ex :
        * int retorno = metodo(new int[]{1,2,3,4,5,})
        * */

        System.out.println("array1 ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("array2");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
        ///////////////////////////////////////
        System.out.println("for each");
        for(int num: numeros2){
            System.out.println(num);
        }


    }
}
