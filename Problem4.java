// Java Program to demonstrate exception handling using various constructs
public class Problem4 {
    public static void main(String[] args) {
      // Using try and catch blocks to handle exceptions
      try {
        int a = 10;
        int b = 0;
        int c = a / b; // This will cause an ArithmeticException
        System.out.println(c);
      } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero");
      }
  
      // Using multiple catch blocks to handle different types of exceptions
      try {
        int[] arr = new int[5];
        arr[5] = 10; // This will cause an ArrayIndexOutOfBoundsException
        String s = null;
        System.out.println(s.length()); // This will cause a NullPointerException
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array index out of bounds");
      } catch (NullPointerException e) {
        System.out.println("String is null");
      }
  
      // Using nested try blocks to handle exceptions in different scopes
      try {
        int x = 10;
        int y = 0;
        int z = x / y; // This will cause an ArithmeticException
        System.out.println(z);
        try {
          String s = "abc";
          int n = Integer.parseInt(s); // This will cause a NumberFormatException
          System.out.println(n);
        } catch (NumberFormatException e) {
          System.out.println("Invalid number format");
        }
      } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero");
      }
  
      // Using try-catch-finally blocks to handle exceptions and execute some code regardless of exception
      try {
        int a = 10;
        int b = 0;
        int c = a / b; // This will cause an ArithmeticException
        System.out.println(c);
      } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero");
      } finally {
        System.out.println("This code will always execute");
      }
  
      // Using throw keyword to explicitly throw an exception
      try {
        int age = 15;
        if (age < 18) {
          throw new ArithmeticException("Not eligible to vote"); // Throwing an exception with a custom message
        } else {
          System.out.println("Eligible to vote");
        }
      } catch (ArithmeticException e) {
        System.out.println(e.getMessage()); // Printing the exception message
      }
  
      // Using throws keyword to declare an exception
      try {
        divide(10, 0); // Calling a method that may throw an exception
      } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero");
      }
    }
  
    // Defining a method that may throw an exception
    static void divide(int a, int b) throws ArithmeticException {
      int c = a / b; // This may cause an ArithmeticException
      System.out.println(c);
    }
  }
  