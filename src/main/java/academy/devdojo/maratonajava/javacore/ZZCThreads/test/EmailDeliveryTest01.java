package academy.devdojo.maratonajava.javacore.ZZCThreads.test;

import academy.devdojo.maratonajava.javacore.ZZCThreads.domain.Members;
import academy.devdojo.maratonajava.javacore.ZZCThreads.service.EmailDeliveryService;

import javax.swing.*;
import java.lang.reflect.Member;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();

        new Thread(new EmailDeliveryService(members), "thread1").start();
        new Thread(new EmailDeliveryService(members), "thread2").start();

        while(true){
            String email = JOptionPane.showInputDialog("Entre com o email: ");
            if(email == null || email.isEmpty()){
                members.close();
            }
            members.addMemberEmail(email);
        }


    }
}
