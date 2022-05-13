import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");
        double number = input.nextDouble();

        while (number < 1 || number > 10) {
            System.out.println("Invalid number! Try again!");
            number = input.nextDouble();
        } 
        
        System.out.println(number + " is a valid number");

        input.close();
    }
}
