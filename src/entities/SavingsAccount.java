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

    @Override
    public final void withdraw(double amount) {  //Se a conta for do tipo poupança, não irá descontar 5.0 no saque como na conta normal
        balance = balance - amount;
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

}
