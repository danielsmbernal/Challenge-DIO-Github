import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Which day of the week is it? ");
        String dayOfTheWeek = input.next();
        numDayWeek(dayOfTheWeek);
        
        System.out.print("What's the variable value? ");
        int a = input.nextInt();    
        definedVariable(a);
        
        input.close();
    }
    
    public static void numDayWeek(String dayOfTheWeek) {
        switch (dayOfTheWeek) {
            case "sunday": 
            System.out.println("1");
            break;
            case "monday": 
                System.out.println("2");
                break;
            case "tuesday": 
                System.out.println("3");
                break;
            case "wednesday": 
                System.out.println("4");
                break;
            case "thursday": 
                System.out.println("5");
                break;
            case "friday": 
                System.out.println("6");
                break;
            case "saturday": 
                System.out.println("7");
                break;
        }
    }        

    public static void definedVariable(int a) {
        switch (a) {
            case 1:
                System.out.println("RIGHT!");
                break;
            case 2:
                System.out.println("RIGHT!");
                break;
            case 3:
                System.out.println("RIGHT!");
                break;
            case 4:
                System.out.println("MAYBE...");
                break;
            case 5: 
                System.out.println("WRONG!");
                break;
            default:
                System.out.println("UNDEFINED");
        }
                
    }
}
