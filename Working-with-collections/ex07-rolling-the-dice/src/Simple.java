import java.util.Random;

public class Simple {
    public static void main(String[] args) {
        
        Random diceNumbers = new Random();

        int num1=0, num2=0, num3=0, num4=0, num5=0, num6=0;

        for(int i=0; i<100; i++) {
            int rollingTheDice = diceNumbers.nextInt(6) + 1;
            switch(rollingTheDice){
                case 1: num1 += 1;
                break;
                case 2: num2 += 1;
                break;
                case 3: num3 += 1;
                break;
                case 4: num4 += 1;
                break;
                case 5: num5 += 1;
                break;
                case 6: num6 += 1;
                break;
            }
        }

        System.out.print("NUMBER 1: " + num1 +
                          "\nNUMBER 2: " + num2 +
                          "\nNUMBER 3: " + num3 +
                          "\nNUMBER 4: " + num4 +
                          "\nNUMBER 5: " + num5 +
                          "\nNUMBER 6: " + num6);
    }
}
