import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int factorial = input.nextInt();
        int result = 1;

        for (int i=factorial; i>=1; i--) {
            result = result * i;
        }

        System.out.println(factorial + "! = " + result);

        input.close();
    }
}
