// Java Program to demonstrate method overriding and super keyword
// Creating a parent class
class Animal {
    // Defining a method
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Creating a child class
class Dog extends Animal {
    // Overriding the method
    void eat() {
        System.out.println("Dog is eating");
    }

    // Defining another method
    void bark() {
        System.out.println("Dog is barking");
    }

    // Defining a method to call the parent class method
    void superEat() {
        super.eat(); // Using super keyword to invoke the parent class method
    }
}

public class Problem1 {

    public static void main(String[] args) {
        Dog d = new Dog(); // Creating an object of the child class
        d.eat(); // Calling the overridden method
        d.bark(); // Calling the child class method
        d.superEat(); // Calling the parent class method
    }
}
