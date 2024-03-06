import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Trying to access an out-of-bound index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound exception occurred.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
