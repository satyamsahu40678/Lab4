// Java Program to demonstrate overriding constructors and dynamic method dispatch
// Creating a parent class
class Shape {
    // Defining a constructor
    Shape() {
      System.out.println("Shape constructor");
    }
  
    // Defining a method
    void draw() {
      System.out.println("Drawing a shape");
    }
  }
  
  // Creating a child class
  class Circle extends Shape {
    // Overriding the constructor
    Circle() {
      super(); // Calling the parent class constructor
      System.out.println("Circle constructor");
    }
  
    // Overriding the method
    void draw() {
      System.out.println("Drawing a circle");
    }
  }
  
  // Creating another child class
  class Square extends Shape {
    // Overriding the constructor
    Square() {
      super(); // Calling the parent class constructor
      System.out.println("Square constructor");
    }
  
    // Overriding the method
    void draw() {
      System.out.println("Drawing a square");
    }
  }
  
  public class Problem2 {
    public static void main(String[] args) {
      Shape s; // Creating a reference of the parent class
      s = new Circle(); // Assigning the reference to the child class object
      s.draw(); // Calling the overridden method (dynamic method dispatch)
      s = new Square(); // Assigning the reference to another child class object
      s.draw(); // Calling the overridden method (dynamic method dispatch)
    }
  }
  