import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int count = 0, number = 0, bigNumber = 0; 
        double sum = 0;

        while (count < 5) {
        System.out.print("Enter a number: ");
        number = input.nextInt();

        sum += number;

        if (number > bigNumber) {
            bigNumber = number;
        }
        
        count++;
        }

        System.out.println("The biggest number is: " + bigNumber);
        System.out.println("The average number is: " + sum / 5);               
        
        input.close();
    }
}

    


