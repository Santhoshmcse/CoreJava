// Demonstrates Method Overloading and Method Overriding
// Real-world examples: Payment Service & Notification System

// -------------------------------
// METHOD OVERLOADING EXAMPLE
// -------------------------------
class PaymentService {

    // Pay using card
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Card");
    }

    // Pay using card with currency
    void pay(double amount, String currency) {
        System.out.println("Paid " + amount + " " + currency + " using Card");
    }

    // Pay using UPI
    void pay(String upiId, double amount) {
        System.out.println("Paid " + amount + " using UPI: " + upiId);
    }
}

// -------------------------------
// METHOD OVERRIDING EXAMPLE
// -------------------------------
class Notification {

    void send(String message) {
        System.out.println("Sending generic notification: " + message);
    }
}

class EmailNotification extends Notification {

    @Override
    void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}

class SmsNotification extends Notification {

    @Override
    void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

// -------------------------------
// DEMO CLASS (OPTIONAL)
// -------------------------------
public class OverloadingVsOverriding {

    public static void main(String[] args) {

        // Overloading Demo
        PaymentService paymentService = new PaymentService();
        paymentService.pay(500);
        paymentService.pay(1000, "INR");
        paymentService.pay("santhosh@upi", 750);

        // Overriding Demo
        Notification notification1 = new EmailNotification();
        notification1.send("Order Confirmed");

        Notification notification2 = new SmsNotification();
        notification2.send("Payment Successful");
    }
}
