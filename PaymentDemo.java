public class PaymentDemo {

    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        p1.pay(1500);

        Payment p2 = new UPIPayment();
        p2.pay(800);
    }
}
