import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Complex {

    public static void main(String[] args) {
        
        Random diceNumbers = new Random();
        
        List <Integer> numStored = new ArrayList<>();

        for(int i=0; i<100; i++) {
            int rollingTheDice = diceNumbers.nextInt(6) + 1;
            numStored.add(rollingTheDice);
        }

        Map <Integer, Integer> numStored1 = new HashMap<>();
        for (Integer result : numStored) {
            if (numStored1.containsKey(result))
                numStored1.put(result, (numStored1.get(result) + 1));
            else numStored1.put(result, 1);
        }

        for (Map.Entry<Integer, Integer> entry : numStored1.entrySet()) {
            System.out.printf("NUMBER %d: %d%n", entry.getKey(), entry.getValue());
        }
    }
}
