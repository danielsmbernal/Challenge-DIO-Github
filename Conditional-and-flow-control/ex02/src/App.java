import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("What's the variable value? ");
        int a = input.nextInt();

        switch (a) {
            case 1:
                System.out.println("RIGHT!");
                break;
            case 2:
                System.out.println("RIGHT!");
                break;
            case 3:
                System.out.println("RIGHT!");
                break;
            case 4:
                System.out.println("MAYBE...");
                break;
            case 5: 
                System.out.println("WRONG!");
                break;
            default:
                System.out.println("UNDEFINED");
        }

        input.close();
    }
}
