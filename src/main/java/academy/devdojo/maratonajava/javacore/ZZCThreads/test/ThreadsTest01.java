package academy.devdojo.maratonajava.javacore.ZZCThreads.test;

class ThreadExample extends Thread {
    private char c;

    public ThreadExample(char c) {
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
    }
}

class ThreadExampleRunnable implements Runnable {
    private char c;

    public ThreadExampleRunnable(char c) {
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
    }
}

public class ThreadsTest01 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        /*ThreadExample t = new ThreadExample('a');
        ThreadExample t2 = new ThreadExample('b');
        ThreadExample t3 = new ThreadExample('c');
        ThreadExample t4 = new ThreadExample('d');*/
        Thread t = new Thread(new ThreadExampleRunnable('a'), "T1A");
        Thread t2 = new Thread(new ThreadExampleRunnable('b'), "T2B");
        Thread t3 = new Thread(new ThreadExampleRunnable('c'), "T3C");
        Thread t4 = new Thread(new ThreadExampleRunnable('d'), "T4D");

        t4.setPriority(Thread.NORM_PRIORITY);
        t.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
