import java.util.Random;

public class App {
    public static void main(String[] args) {

        int[] array = new int[20];
        Random random = new Random();

        for (int i=0; i<array.length; i++) {
            array [i] = random.nextInt(100);         
            
        }
        System.out.println("Random numbers: ");
        for (int numbers : array) {
            System.out.print(numbers + " ");
        }

        System.out.println("\nSucessors of the random numbers: ");
        for (int numbers : array) {
            System.out.print((numbers + 1) + " ");
        }   
    }
}
