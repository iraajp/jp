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

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// This program demonstrates exception handling in Java.
// It shows try-catch-finally blocks, handling specific exceptions, and creating custom exceptions,
// illustrating how to manage runtime errors gracefully.