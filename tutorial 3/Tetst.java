public class Tetst {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();

        s.deposit(1000);
        System.out.println(s.balance);

        // s.withdraw(500);
        // System.out.println(s.balance);
    }
}
