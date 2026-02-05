public class Oops {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount(101, "Santhosh", 5000);
        BankAccount acc2 = new CurrentAccount(102, "Ravi", 8000);

        acc1.deposit(2000);
        acc1.withdraw(1000);
        System.out.println(acc1.calculateInterest());

        acc2.deposit(3000);
        acc2.withdraw(2000);
        System.out.println(acc2.calculateInterest());
    }
}
