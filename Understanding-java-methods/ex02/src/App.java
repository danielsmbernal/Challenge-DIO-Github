import java.util.Locale;
import java.util.Scanner;

import entities.Quadrilaterals;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("SQUARE:");
        System.out.print("Enter the side of the square: ");
        double side = input.nextDouble();
        Quadrilaterals.areaSquare(side);

        System.out.println("\nRECTANGLE:");
        System.out.print("Enter the base and the height of the rectangle: ");
        double base = input.nextDouble();
        double height = input.nextDouble();
        Quadrilaterals.areaRectangle(base, height);

        System.out.println("\nTRAPEZIUM:");
        System.out.print("Enter the two bases and the height of the trapezium: ");
        double base1 = input.nextDouble();
        double base2 = input.nextDouble();
        height = input.nextDouble();
        Quadrilaterals.areaTrapezium(base1, base2, height);

        input.close();
    }
}
