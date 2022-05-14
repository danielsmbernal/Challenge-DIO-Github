import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String[] letters = new String[6];
        int sumConsonant = 0;
        
        //Adding to array
        for (int i=0; i<letters.length; i++) {

            System.out.print("Enter one character: ");
            String character = input.next();

            if (!(character.equals("a") || 
                character.equals("e") ||
                character.equals("i") ||
                character.equals("o") ||
                character.equals("u"))) {
                     letters[i] = character;
               } 
        }

        //displaying and summing consonants
        for (int i=0; i<letters.length; i++) {
            if (letters[i] != null) {
                sumConsonant++;
                System.out.print(letters[i] + " ");
            }
        }

        System.out.println("The sum of the consonants is: " + sumConsonant);

        input.close();
    }
}
