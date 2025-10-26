public class Program2 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition of two integers: " + calc.add(5, 10));
        System.out.println("Addition of three integers: " + calc.add(5, 10, 15));
        System.out.println("Addition of two doubles: " + calc.add(5.5, 10.5));
        System.out.println("Addition of integer and double: " + calc.add(5, 10.5));
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public double add(int a, double b) {
        return a + b;
    }
}

// This program demonstrates method overloading in Java.
// It defines multiple add methods with the same name but different parameter types and counts,
// allowing flexible addition operations.