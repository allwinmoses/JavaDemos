package voya;

public class Bank {
    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount){
        if(amount<balance){
            balance = balance-amount;
        }else{
            System.out.println("Not enough balance");
        }

    }
    void deposit(double amount){
        balance=balance+amount;
        System.out.println("Amount deposited"+balance);

    }
    double getBalance(){
        return balance;

    }
}
