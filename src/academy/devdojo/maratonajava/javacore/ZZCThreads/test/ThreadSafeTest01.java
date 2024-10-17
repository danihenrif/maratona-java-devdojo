package academy.devdojo.maratonajava.javacore.ZZCThreads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames {
    private final List<String> names = Collections.synchronizedList(new ArrayList<>());

    public synchronized void add(String name){
        names.add(name);
    }
    public synchronized void removeFirst(){
        System.out.println(Thread.currentThread().getName());
        if (names.size() > 0) System.out.println(names.remove(0));
        else System.out.println("não tem oq remover");
    }
}
public class ThreadSafeTest01 {
    public static void main(String[] args) {
        ThreadSafeNames tsn = new ThreadSafeNames();
        tsn.add("nome1");
        Runnable r = tsn::removeFirst;
        new Thread(r).start();
        new Thread(r).start();
        /*Runnable r = () -> {
            tsn.removeFirst();
        };*/


    }
}
