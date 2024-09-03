package academy.devdojo.maratonajava.javacore.MException.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            System.out.println(divisao(1,0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Continua ? Sim !!!");
    }

    /**
     *
     * @param a dividendo
     * @param b divisor
     * @return a divisão de a por b
     * @throws IllegalArgumentException caso b seja 0
     */
    //não há necessidade de colocar o throws em excessões unchecked
    private static int divisao(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Argumento b não pode ser zero");
        }
        return 0;
//        try {
//            return a/b;
//        }catch (ArithmeticException e) {
//            e.printStackTrace();
//        }
//        return 0;
    }
}
