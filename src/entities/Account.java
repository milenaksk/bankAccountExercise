package entities;

public class Account {
    private int number;
    private String holder;
    protected double balance;


    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Account() {

    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        balance = balance - amount - 5.0;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

}
