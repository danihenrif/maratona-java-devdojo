package academy.devdojo.maratonajava.javacore.ZZCThreads.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen(){
        return open;
    }

    public int pendingEmails(){
        synchronized (emails){
            return emails.size();
        }
    }

    public void addMemberEmail(String email){
        synchronized (emails){
            Thread t = Thread.currentThread();
            System.out.println(Thread.currentThread().getName());
            System.out.println(t + " adicionou email na lista");
            this.emails.add(email);
            //TODO voltar quando a thread estiver esperando
            this.emails.notifyAll();//notifica a todos que voltou
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " is checking if there are emails");
        synchronized (emails){
            while(this.emails.size() == 0){
                if(!open) return null;
                System.out.println(Thread.currentThread().getName() + " There is no email avalible on list, entering" +
                        "standby mode");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void close(){
        open = false;
        synchronized (emails){
            System.out.println(Thread.currentThread().getName() + " Notifiying all that retrieve emails is close");
            notifyAll();
        }
    }
}
