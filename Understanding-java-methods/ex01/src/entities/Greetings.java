package entities;

import java.util.Date;
import java.util.Calendar;

public class Greetings {
    
    public static void greeting (Date dayTime) {

        Calendar time = Calendar.getInstance();
        time.setTime(dayTime);

        Calendar morning = Calendar.getInstance();
        morning.set(Calendar.HOUR_OF_DAY, 11);
        morning.set(Calendar.MINUTE, 59);

        Calendar afternoon = Calendar.getInstance();
        afternoon.set(Calendar.HOUR_OF_DAY, 12);

        Calendar endAfternoon = Calendar.getInstance();
        endAfternoon.set(Calendar.HOUR_OF_DAY, 17);
        endAfternoon.set(Calendar.MINUTE, 59);

        Calendar night = Calendar.getInstance();
        night.set(Calendar.HOUR_OF_DAY, 18);

        Calendar beforeMidnight = Calendar.getInstance();
        beforeMidnight.set(Calendar.HOUR_OF_DAY, 23);
        beforeMidnight.set(Calendar.MINUTE, 59);

        Calendar midnight = Calendar.getInstance();
        midnight.set(Calendar.HOUR_OF_DAY, 24);

         if (time.before(afternoon) && time.after(beforeMidnight)) {
             System.out.println("Good morning!");
         }

         if (time.before(night) && time.after(morning)) {
             System.out.println("Good afternoon!");
         }

         if (time.before(midnight) && time.after(endAfternoon)) {
             System.out.println("Good night!");
         }
        
        }
}
