package entities;

public class BusinessAccount extends Account {
    private double loanLimit;


    public BusinessAccount() {
        super();
    }

    public BusinessAccount(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance = balance + 5;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void loan(double amount) { //usamos o protected para poder acessar o atributo balance
        if (amount >= loanLimit) {
            balance = balance + amount - 10.0;
        }
    }
}
