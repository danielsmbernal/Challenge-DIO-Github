import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        List <String> answers = new ArrayList<>();
        
        System.out.print("Did you called the victim (y/n)? ");
        String question1 = input.next();
        answers.add(question1.toLowerCase());

        System.out.print("Have you been in the crime scene (y/n)? ");
        String question2 = input.next();
        answers.add(question2.toLowerCase());

        System.out.print("Do you live close to the victim house (y/n)? ");
        String question3 = input.next();
        answers.add(question3.toLowerCase());

        System.out.print("Did you owed money to the vitcim (y/n)? ");
        String question4 = input.next();
        answers.add(question4.toLowerCase());

        System.out.print("Have you worked with the victim (y/n)? ");
        String question5 = input.next();
        answers.add(question5.toLowerCase());

        Iterator<String> itr = answers.iterator();
        int numAnswer = 0;
        while (itr.hasNext()) {
            String next = itr.next();
            if (next.contains("y") ){
                numAnswer++;
            }
        }
        
        if (numAnswer == 2) {
            System.out.print("SUSPECT");
        } else if (numAnswer == 3 || numAnswer == 4){
            System.err.print("ACCOMPLICE");
        } else if (numAnswer == 5 ) {
            System.out.println("KILLER");
        } else {
            System.out.println("INNOCENT");
        }
      
        input.close();
    }
}
