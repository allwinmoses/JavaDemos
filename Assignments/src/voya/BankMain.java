package voya;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Bank bank =new Bank(1000);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter choice");
        int choice = scanner.nextInt();

        if(choice ==1){
            double withdrawAmount = scanner.nextDouble();
            bank.withdraw(withdrawAmount);

        }else if(choice==2){
            double depositAmount = scanner.nextDouble();
            bank.deposit(depositAmount);

        } else if (choice==3) {
            System.out.println(bank.getBalance());

        }else{
            System.out.println("Enter again");
        }



    }

}
