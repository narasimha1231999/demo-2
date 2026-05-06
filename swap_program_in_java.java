/**
 * Simple Java program to swap two numbers.
 * Author: Narasimha
 */
public class SwapNumbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);

        // Swap logic using temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }
}