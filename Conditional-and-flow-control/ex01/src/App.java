import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) {

        Date currentDate = new Date();

        Calendar cal = Calendar.getInstance();
        cal.setTime(currentDate);
        int month = 1 + cal.get(Calendar.MONTH);

        defineMonth(month);
        defineVacation(month);
    }
    
    public static void defineMonth (int month) {
        if (month == 1) {
            System.out.println("JANUARY");
        } else if( month == 2){
            System.out.println("FEBRUARY");
        } else if( month == 3){
            System.out.println("MARCH");
        } else if( month == 4){
            System.out.println("APRIL");
        } else if( month == 5){
            System.out.println("MAY");
        } else if( month == 6){
            System.out.println("JUNE");
        } else if( month == 7){
            System.out.println("JULY");
        } else if( month == 8){
            System.out.println("AUGUST");
        } else if( month == 9){
            System.out.println("SEPTEMBER");
        } else if( month == 10){
            System.out.println("OCTOBER");
        } else if( month == 11){
            System.out.println("NOVEMBER");
        } else {
            System.out.println("DECEMBER");
        }
    }
    
    private static void defineVacation(int month) {
        if (month == 1 || month == 7 || month == 12 ) {
            System.out.println("VACATION!!!");
        }  
    }
}
