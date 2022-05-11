package entities;

public class Calculator {
    
    public static void sum (double a, double b) {
        double sum = a + b;
        System.out.printf("SUM: %.2f%n", sum);
    }

    public static void subtraction (double a, double b) {
        double subtraction = a - b;
        System.out.printf("SUBTRACTION: %.2f%n", subtraction);
    }

    public static void multiplication (double a, double b) {
        double multiplication = a * b;
        System.out.printf("MULTIPLICATION: %.2f%n", multiplication);
    }

    public static void division (double a, double b) {
        double division = a / b;
        System.out.printf("DIVISION: %.2f%n", division);
    }
}
