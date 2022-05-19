import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        
        //Creating set
        Set <String> rainbowCollors = new LinkedHashSet<>(Arrays.asList("Red", "Orange", 
            "Yellow", "Green", "Blue", "Indigo", "Violet"));
        
        //Collors one above the other    
        for (String collor : rainbowCollors) {
            System.out.println(collor);
        }

        //How many collors the rainbow has
        System.out.println("\nThe rainbow has " + rainbowCollors.size() + " collors");

        //collors in alphabetic order
        Set <String> rainbowCollorsAlpha = new TreeSet<>();
        rainbowCollorsAlpha.addAll(rainbowCollors);
        System.out.println("\nRainbow collors in alphabetic order: " + rainbowCollorsAlpha);

        //collors in the reverse order of what was informed
        ArrayList <String> rainbowCollorsArray = new ArrayList<String>(rainbowCollors);
        Collections.reverse(rainbowCollorsArray);
        System.out.println("\nRainbow collors in the reverse order: " + rainbowCollorsArray);

        //Collors that start with the letter "V"
        Iterator <String> itr = rainbowCollors.iterator();

        while (itr.hasNext()) {
            String next = itr.next();
            if (next.charAt(0) == 'V') 
            System.out.println("\nCollors that start with letter \"V\": " + next);
        }

        //The set without the collors that start with the letter "V".
        Iterator <String> itr1 = rainbowCollors.iterator();

        while (itr1.hasNext()) {
            String next = itr1.next();
            if (next.charAt(0) == 'V') {
                rainbowCollors.remove(next);
                System.out.println("\nThe set without the collors that start with letter \"V\": " + rainbowCollors);
            }
        }

        //Clear the set
        rainbowCollors.clear();

        //Check if the set is empty.
        System.out.println("\nIs the set empty? " + rainbowCollors.isEmpty()); 
        
    }
}
