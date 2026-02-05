public abstract class OnlinePayment {

    protected String transactionId;

    void generateTxnId() {
        transactionId = "TXN" + System.currentTimeMillis();
    }

    abstract void processPayment(double amount);
}
