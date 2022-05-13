import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.print("Enter an integer number between 1 and 10: ");
        int multiTableNum = input.nextInt();

        while (multiTableNum < 1 || multiTableNum > 10) {
            System.out.println("Invalid number! Try again!");
            multiTableNum = input.nextInt();
        }

        System.out.println();

        for (int i=1; i<=10; i++) {
            System.out.println(multiTableNum
                                + " X " 
                                + i 
                                + " = "
                                + (multiTableNum * i));
        }

        input.close();
    }
}
