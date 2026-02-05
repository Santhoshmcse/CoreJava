// OOP Concepts Demonstration
// Topics: Encapsulation, Abstraction, Inheritance, Polymorphism

// Encapsulation: business rules inside class
class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid deposit amount");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }
}

// Abstraction
abstract class Payment {
    abstract void pay(double amount);
}

// Inheritance + Polymorphism
class CreditCardPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UpiPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

// Optional Demo Class (for local testing)
public class OOPConcepts {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);
        account.deposit(2000);
        account.withdraw(1500);
        System.out.println("Balance: " + account.getBalance());

        Payment payment1 = new CreditCardPayment();
        payment1.pay(1000);

        Payment payment2 = new UpiPayment();
        payment2.pay(500);
    }
}
