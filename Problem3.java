final class Vehicle {
    final int speedLimit = 100;

    final void run() {
        System.out.println("Vehicle is running");
    }
}

class Car {
    // You can't extend a final class, so Car doesn't extend Vehicle

    // Constructor or initialization block to assign value to speedLimit
    int speedLimit;

    Car() {
        this.speedLimit = 120;
    }

    // Method to demonstrate running a car
    void run() {
        System.out.println("Car is running");
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Car c = new Car();
        c.run();
    }
}
