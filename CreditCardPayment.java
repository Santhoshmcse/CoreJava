public class CreditCardPayment extends OnlinePayment implements Payment {

    @Override
    public void pay(double amount) {
        generateTxnId();
        processPayment(amount);
        System.out.println("Credit Card Payment Successful. TxnId: " + transactionId);
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of " + amount);
    }
}
