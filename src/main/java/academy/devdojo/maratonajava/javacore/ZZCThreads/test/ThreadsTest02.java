package academy.devdojo.maratonajava.javacore.ZZCThreads.test;

class ThreadExampleRunnable2 implements Runnable {
    private String c;

    public ThreadExampleRunnable2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if(i % 100 == 0)
                System.out.println();
        }
        Thread.yield();//Indica o processador que a thread pode voltar para runnable
    }
}
public class ThreadsTest02 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread(new ThreadExampleRunnable2("KA"));
        Thread t2 = new Thread(new ThreadExampleRunnable2("ME"));
        Thread t3 = new Thread(new ThreadExampleRunnable2("HA"));
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t1.join(); //main não prossegue enquanto t1 não acaba
        t2.start();
        t3.start();

        //1 forma
        /*Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });*/

        //2 forma
        /*Thread t1 = new Thread(() -> {

        }).start();*/

        //3 forma
        /*Runnable t1 = () -> {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 1000; i++) {
                System.out.print(c);
                if(i % 100 == 0)
                    System.out.println();
            }
        };*/

    }
}
