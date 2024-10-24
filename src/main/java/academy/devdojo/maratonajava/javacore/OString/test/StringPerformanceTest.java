package academy.devdojo.maratonajava.javacore.OString.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(10_000);
        long fim = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (fim - inicio) + "ms");

        long inicio2 = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        long fim2 = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (fim2 - inicio2) + "ms");

        long inicio3 = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        long fim3 = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (fim3 - inicio3) + "ms");
    }
    private static void concatString(int tamanho){
        String txt = "";
        for(int i=0; i<tamanho; i++){
            txt += i;
        }
    }
    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for(int i=0; i<tamanho; i++){
            sb.append(i);
        }
    }
    //Para ambientes multi thread
    private static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for(int i=0; i<tamanho; i++){
            sb.append(i);
        }
    }
}
