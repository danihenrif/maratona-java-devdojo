package academy.devdojo.maratonajava.introducao;

public class Aula38Arrayinicializacao {
    public static void main(String[] args) {
        int [][] arr = new int[3][];

        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[3];

        for (int[] arrBase : arr){
            System.out.println();
            for(int num : arrBase){
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
