import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {

    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List <Double> temperatures = new ArrayList<>();
        double sum = 0;

        //Adding numbers to the list
        for (int i=0; i<6; i++) {
            
            System.out.print("Enter a temperature: ");
            double temp = input.nextDouble();
            temperatures.add(temp);
            sum += temp;
        }
        //Calculating the average
        double tempAverage = sum / 6;

        //Calculating the numbers above the average and adding the months
        Iterator <Double> itr = temperatures.iterator();
        int i = 0;

        while (itr.hasNext()) {
            double next = itr.next();
            if (next > tempAverage) {
                switch (i) {
                    case (0) : System.out.printf("January: %.1f%n", next);
                    break;
                    case (1) : System.out.printf("February: %.1f%n", next);
                    break;
                    case (2) : System.out.printf("March: %.1f%n", next);
                    break;
                    case (3) : System.out.printf("April: %.1f%n", next);
                    break;
                    case (4) : System.out.printf("May: %.1f%n", next);
                    break;
                    case (5) : System.out.printf("June: %.1f%n", next);
                    break;
                    default: System.out.println("No temperatures above de average!");
                }
            }
            i++;
        }  

        input.close();
        
    }
}
