import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the quantity of numbers: ");
        int quantityNumbers = input.nextInt();

        int even = 0, odd = 0;

        for (int i=0; i < quantityNumbers; i++) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            
            if (number % 2 == 0) even++;
            else odd++;
            }

        System.out.println("EVEN: " + even);
        System.out.println("ODD: " + odd);

        input.close();
        
    }
}
