package entities;

public class Quadrilaterals {
    
    public static double area (double side) {
        return side * 2;        
    }

    public static double area (double base, double height) {
        return base * height;
    }

    public static float area (float base1, float base2, float height1) {
        return ((base1 + base2) * height1) / 2;  
    }
}
