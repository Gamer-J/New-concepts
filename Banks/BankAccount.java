public class BankAccount {
    String owner;
    int accountNumber;
    double balance;

    public BankAccount() {
        owner = "";
        accountNumber = 0;
        balance = 0;
    }

    public BankAccount(String owner, int accountNumber, double balance) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawing");
        if (this.balance >= amount) {
            balance -= amount;
        }
    }
}
