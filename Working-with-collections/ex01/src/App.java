import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List <Double> notes1 = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        List <Double> notes2 = new LinkedList<>();
        notes2.addAll(notes1);

        //first goal
        System.out.println("NOTES2: " + notes2);

        //second goal
        System.out.println("FIRST NOTE: " + (notes2.get(0)));

        //third goal
        notes2.remove(0);
        System.out.println("NOTES2 WITHOUT FIRST NOTE: " + notes2);

        


        
    } 
}