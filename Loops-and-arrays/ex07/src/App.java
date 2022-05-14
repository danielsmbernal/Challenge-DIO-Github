import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int newArr [] = new int [6];

        for (int i=0; i<newArr.length; i++) {

            System.out.print("Enter a number: ");
            int number = input.nextInt();

            newArr [i] = number;
        }

        for (int i=newArr.length-1; i>=0; i--) {

            System.out.print(newArr[i] + " ");
        }

        input.close();
        
    }
}
