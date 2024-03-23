public class SavingsAccount extends BankAccount {
    public SavingsAccount() {
        super();
    }

    public SavingsAccount(String owner, int accountNumber, double balance) {
        super(owner, accountNumber, balance);
    }

    public void withdraw(double amount) {
        // do nothing
    }

    public void deposit(double amount){
        int wholeDollars = (int)(amount/100);
        super.deposit(amount+wholeDollars);
    }
}