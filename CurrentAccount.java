class CurrentAccount extends BankAccount {

    public CurrentAccount(long accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
    }

    @Override
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
            return;
        }
        balance -= amount;
    }

    @Override
    double calculateInterest() {
        return 0;
    }
}
