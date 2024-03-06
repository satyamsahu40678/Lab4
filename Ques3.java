import java.util.Scanner;

final class FinalClass {
    final int value = 10; // final variable
    
    final void display() { // final method
        System.out.println("This is a final method.");
    }
}

public class Ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        FinalClass obj = new FinalClass();
        System.out.println("Value: " + obj.value);
        obj.display();
    }
}
