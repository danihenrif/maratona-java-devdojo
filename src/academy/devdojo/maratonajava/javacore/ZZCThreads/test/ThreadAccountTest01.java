package academy.devdojo.maratonajava.javacore.ZZCThreads.test;

import academy.devdojo.maratonajava.javacore.ZZCThreads.domain.Account;

public class ThreadAccountTest01 implements Runnable {
    private Account account = new Account();

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if(account.getBalance() < 0) {
                System.out.println("deu merda");
            }
        }
    }

    public static void main(String[] args) {
        ThreadAccountTest01 thread = new ThreadAccountTest01();
        Thread t1 = new Thread(thread, "Thread1");
        Thread t2 = new Thread(thread, "Thread2");
        /*Thread t3 = new Thread(new ThreadAccountTest01(), "Thread3");
        Thread t4 = new Thread(new ThreadAccountTest01(), "Thread4");*/
        t1.start();
        t2.start();
        /*t3.start();
        t4.start();*/
    }
    //synchronized serve para travar o method de ser acessado por mais de uma thread "ao mesmo tempo"
    private synchronized void withdrawal(int amount){
        //posso sincronizar o account também, mas ao fazer isso é recomendável que ela seja final
        if(account.getBalance() >= amount){
            System.out.println(Thread.currentThread().getName() + "está indo sacar");
            account.withdrawal(amount);
            System.out.println(Thread.currentThread().getName() + "completou o saque, valor da conta agora : " + account.getBalance());
        }
        else{
            System.out.println("Sem grana para a thread " + Thread.currentThread().getName() + " sacar");
        }
    }

    /*
    * Sincronizar o método (synchronized no método)
    *Isso significa que o objeto que invoca o método está sendo bloqueado. No seu caso, seria o objeto da classe ThreadAccountTest01, que contém a referência account.
    *Portanto, se duas threads tentarem acessar o método withdrawal ao mesmo tempo no mesmo objeto de
    *ThreadAccountTest01, apenas uma delas poderá executar o método de cada vez.
    *Bloqueia o objeto que chama o método (ThreadAccountTest01).
    *Impede que outras threads acessem métodos sincronizados nesse mesmo objeto ao mesmo tempo.
    *Esse tipo de sincronização é útil quando você quer garantir que nenhuma thread acesse métodos sincronizados
    *desse objeto simultaneamente.
    *
    *Sincronizar a instância da classe Account
    *Aqui, o bloqueio ocorre diretamente na instância da classe Account. Isso significa que:
    *Bloqueia o objeto account.
    *Permite que outras threads possam acessar outros métodos da classe ThreadAccountTest01, desde que não tentem
    *acessar o objeto account ao mesmo tempo.
    *Se outra parte do código também sincronizar no objeto account, ela vai esperar até que o bloqueio seja liberado.
    *
    * Quando usar cada abordagem
Sincronizar o método: Você deseja proteger o método inteiro para garantir que uma thread de cada vez execute qualquer método sincronizado da instância que chama o método. Isso é útil quando você quer garantir exclusão mútua em métodos de uma classe específica, como ThreadAccountTest01.

Sincronizar o objeto account: Se o seu objetivo é garantir que o objeto account (ou seja, a conta bancária)
* seja acessado de maneira segura por várias threads, você sincroniza diretamente o account. Nesse caso, você
* está garantindo que duas threads não possam manipular a mesma conta bancária ao mesmo tempo, mas você ainda permite que
* diferentes métodos sincronizados possam ser executados em paralelo, contanto que eles não mexam no objeto account.
    * */
}
