import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {

        //Create a dictionary and list the states and their populations.

        Map <String, Integer> states = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        //Replace the population of RN by 3.534.165.

        states.put("RN", 3534165);
        System.out.println("RN new value: " + states.get("RN"));

        //Check if PB is on the dictionary. If it isn't, add: PB: 4.039.277.

        System.out.println("\nPB: " + states.containsKey("PB"));
        states.put("PB", 4039277);
        System.out.println("PB: " + states.get("PB"));

        // Display the population of PE.

        System.out.println("\nPopulation of PB: " + states.get("PE"));

        //Display all the states and their populations in the informed order.

        Map <String, Integer> statesByOrder = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println("\nAll states in informed order: " + statesByOrder);

        // Display all the states and their populations in the alphabetic order.

        Map <String, Integer> statesByAlphabetic = new TreeMap<>(states);
        System.out.println("\nAll states in alphabetic order: " + statesByAlphabetic);
        
        // Display the state with the smallest population and it's quantity.

        Set<Map.Entry<String, Integer>> entries = states.entrySet();

        Integer smallestPopValue = Collections.min(states.values());
        String smallestPopKey = "";

        for (Map.Entry<String,Integer> entry : entries) {
            if (entry.getValue().equals(smallestPopValue)) {
                smallestPopKey = entry.getKey();
                System.out.println("\nState with the smallest population: " + smallestPopKey + "- " + smallestPopValue);
            }
            
        } 

        // Display the state with the biggest population and it's quantity.

        Integer biggestPopValue = Collections.max(states.values());
        String biggestPopKey = "";

        for (Map.Entry<String,Integer> entry : entries) {
            if (entry.getValue().equals(biggestPopValue)) {
                biggestPopKey = entry.getKey();
                System.out.println("\nState with the biggest population: " + biggestPopKey + "- " + biggestPopValue);
            }
            
        } 

        // Display the sum of the populations.

        Integer sumOfValues = 0;
        for (Map.Entry<String,Integer> entry : entries) {
            sumOfValues += entry.getValue();            
        }

        System.out.println("\nSum of the populations: " + sumOfValues); 

        // Display the average of the populations.

        System.out.println("\nAverage of the populations: " + sumOfValues / states.size());

        // Remove the states with population less than 4.000.000.

        Iterator<Integer> itr = states.values().iterator();
        while (itr.hasNext()) {
            Integer next = itr.next();
            if (next < 4000000) itr.remove();
        }

        System.out.println("\nStates without populations below 4.000.000: " + statesByOrder.toString());

        // Clear the dictionary.
        
        states.clear();

        System.out.println("\n" + states.isEmpty());
    }    
}

