package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Quadrilaterals;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
        double side = input.nextDouble();
        double areaSquare = Quadrilaterals.area(side);
        System.out.println("The area of the square is: " + areaSquare);

        System.out.print("\nEnter the base and the height of the rectangle: ");
        double base = input.nextDouble();
        double height = input.nextDouble();
        double areaRectangle = Quadrilaterals.area(base, height);
        System.out.println("The area of the rectangle is: " + areaRectangle);

        System.out.print("\nEnter the two bases and the height of the trapezium: ");
        float base1 = input.nextFloat();
        float base2 = input.nextFloat();
        float height1 = input.nextFloat();
        float areaTrapezium = Quadrilaterals.area(base1, base2, height1);
        System.out.println("The area of the trapezium is: " + areaTrapezium);

        input.close();
    }
}
