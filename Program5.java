import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            // Division by zero
            int result = 10 / num;
            System.out.println("Result: " + result);

            // Array access
            int[] arr = {1, 2, 3};
            System.out.println("Array element: " + arr[num]);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
            scanner.close();
        }

        // Throwing custom exception
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Age is valid.");
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// This program demonstrates exception handling in Java for robust error management.
// - Try-Catch-Finally: The `try` block contains code that might throw an exception, `catch` blocks handle specific exceptions, and `finally` ensures code runs regardless of an exception.
// - Custom Exception: `InvalidAgeException` is a user-defined exception class that extends `Exception`.
// - Throw/Throws: The `throw` keyword is used to manually trigger an exception, and `throws` declares that a method might throw a particular exception.