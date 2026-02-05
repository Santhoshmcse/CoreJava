public class UPIPayment extends OnlinePayment implements Payment {

    @Override
    public void pay(double amount) {
        generateTxnId();
        processPayment(amount);
        System.out.println("UPI Payment Successful. TxnId: " + transactionId);
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Processing UPI payment of " + amount);
    }
}
