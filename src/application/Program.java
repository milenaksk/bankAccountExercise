package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account x = new Account(1020, "Alex Turner", 1000.0);
        Account y = new BusinessAccount(1023, "Maria", 1000.0, 0.01);

        x.withdraw(50);
        y.withdraw(50);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
