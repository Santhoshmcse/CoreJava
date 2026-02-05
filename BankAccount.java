abstract class BankAccount {

    protected long accountNumber;
    protected String holderName;
    protected double balance;

    public BankAccount(long accountNumber, String holderName, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    abstract double calculateInterest();

    public double getBalance() {
        return balance;
    }
}
