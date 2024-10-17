package academy.devdojo.maratonajava.javacore.ZZDConcurrency.test;

import java.util.concurrent.atomic.AtomicInteger;

class Counter{
    private int count;
    private AtomicInteger atomic = new AtomicInteger(0);

    void increment(){
        /*synchronized(this){
            count++;
        }*/
        count++;
        //foiac sem necessidade de sincronizar
        atomic.incrementAndGet();
    }

    public int getCount() {
        return count;
    }

    public AtomicInteger getAtomic() {
        return atomic;
    }
}

public class AtomicIntegerTest01 {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        Runnable runnable = () -> {
            for (int i = 0; i < 10_000; i++) {
                counter.increment();
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        long startTime = System.nanoTime();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.getCount());
        System.out.println(counter.getAtomic());


        // Medindo o tempo após a execução das threads
        long endTime = System.nanoTime();

        // Calculando o tempo total de execução
        long duration = endTime - startTime;

        // Exibindo o resultado
        System.out.println("Total count: " + counter.getCount());
        System.out.println("Tempo de execução: " + duration + " nanosegundos");

    }
}
