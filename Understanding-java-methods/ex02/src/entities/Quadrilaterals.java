package entities;

public class Quadrilaterals {

    public static void areaSquare (double side) {
        double area = side * 2;
        System.out.println("The area of the square is: " + area);
    }

    public static void areaRectangle (double base, double height) {
        double area = base * height;
        System.out.println("The area of the rectangle is: " + area);
    }

    public static void areaTrapezium (double base1, double base2, double height) {
        double area = ((base1 + base2) * height) / 2;
        System.out.println("The area of the trapezium is: " + area);
    }
}