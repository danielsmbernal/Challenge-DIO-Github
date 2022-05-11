import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;
import entities.Greetings;

public class App {
    
    
    
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US); 
        Scanner input = new Scanner(System.in);
        Date dayTime = new Date();

        System.out.print("Enter the first value: ");
        int a = input.nextInt();
        System.out.print("Enter the second value: ");
        int b = input.nextInt();
        System.out.println();
 
        Calculator.sum(a, b);
        Calculator.subtraction(a, b);
        Calculator.multiplication(a, b);
        Calculator.division(a, b); 
        System.out.println();

        Greetings.greeting(dayTime);
     
        input.close();
        
    }  
    
    }

