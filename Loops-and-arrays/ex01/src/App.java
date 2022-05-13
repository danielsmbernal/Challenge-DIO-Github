import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a name: ");
            String name = input.nextLine();
            if (name.equals("0")) {
                break;
            } else {
                System.out.print("Enter an age: ");
                int age = input.nextInt();
                input.nextLine();
                System.out.printf("%nNAME: %s AGE: %d%n", name, age);           
            }
        } 
        
        input.close();
    }
}
