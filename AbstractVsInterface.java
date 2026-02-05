// Demonstrates Abstract Class vs Interface

// Abstract Class
abstract class Vehicle {

    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

// Interface
interface Flyable {
    void fly();
}

// Concrete Class using Abstract Class
class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " car started");
    }
}

// Concrete Class implementing Interface
class Drone implements Flyable {

    @Override
    public void fly() {
        System.out.println("Drone is flying");
    }
}

// Demo class (optional)
public class AbstractVsInterface {

    public static void main(String[] args) {

        Vehicle car = new Car("Toyota");
        car.start();
        car.stop();

        Flyable drone = new Drone();
        drone.fly();
    }
}
