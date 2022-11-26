package entities;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount() { //construtor padrão
        super();
    }

    public SavingsAccount(int number, String holder, double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance  = balance * interestRate; //taxa de juros
    }

    @Override
    public void withdraw(double amount) {  //Se a conta for do tipo poupança, não irá descontar 5.0 no saque como na conta normal (withdraw)
        balance = balance - amount;
    }
}
