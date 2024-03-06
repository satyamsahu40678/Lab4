import java.util.Scanner;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creating objects of different classes
        Animal animal = new Animal();
        Dog dog = new Dog();
        
        // Dynamic Method Dispatch
        animal.sound(); // Calls sound() of Animal class
        dog.sound();    // Calls sound() of Dog class
    }
}
