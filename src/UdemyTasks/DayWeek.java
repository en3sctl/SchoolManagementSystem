package UdemyTasks;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DayWeek {
    public static void main(String[] args) {
        for (int i = 2015; i <= 2030; i++) {
            Calendar calendar = new GregorianCalendar(i, Calendar.DECEMBER, 25);
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                System.out.println(calendar.getTime());
            }
        }
    }
}
