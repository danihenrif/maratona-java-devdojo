package academy.devdojo.maratonajava.javacore.ZZDConcurrency.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        //Há um limite de valores para colocar dentro.
        //Se eu tentar colocar um valor a mais da capacidade
        //A thread vai ficar bloqueada.
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        queue.put("Daniel");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), queue.peek());
        System.out.println("Trying to add another value");
        new Thread(new RemoveFromQueue(queue)).start();
        queue.put("Daniel2");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), queue.peek());
    }

    static class RemoveFromQueue implements Runnable {
        private final BlockingQueue<String> bq;

        RemoveFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.printf("%s is going to sleep for 2s %n", Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.printf("%s removing value from queue %s%n", Thread.currentThread().getName(), bq.take());
             } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
