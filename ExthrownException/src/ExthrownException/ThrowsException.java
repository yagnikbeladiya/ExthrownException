package ExthrownException;

import java.util.Scanner;

public class ThrowsException {

    public static int divide(int numerator,int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        try {
            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        try {
            System.out.println("valid input.");
            int result = divide(10, 2); // Valid division
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println( e.getMessage());
        }

        scanner.close();
    }
}
