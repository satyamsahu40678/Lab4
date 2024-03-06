import java.util.Scanner;

class Vehicle {
    void display() {
        System.out.println("This is a vehicle.");
    }
}

class Car extends Vehicle {
    void display() {
        super.display(); // using super keyword to call superclass method
        System.out.println("This is a car.");
    }
}

public class Ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an object of Car
        Car car = new Car();
        
        // Call the overridden method
        car.display();
    }
}
