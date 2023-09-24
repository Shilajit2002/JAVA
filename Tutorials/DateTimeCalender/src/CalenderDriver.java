import java.util.Arrays;
import java.util.Calendar;

public class CalenderDriver {
    public static void main(String[] args) {
        //  Create the Calendar Class Instance
        Calendar C = Calendar.getInstance();

        //  Methods
        System.out.println("Date Time is = " + C.getTime());
        System.out.println("Calendar Type is = " + C.getCalendarType());
        System.out.println("Time is Millis = " + C.getTimeInMillis());
        System.out.println("Time Zone = " + C.getTimeZone());

        System.out.println("Available Calendar = " + Calendar.getAvailableCalendarTypes());
        System.out.println("Available Locals = " + Arrays.toString(Calendar.getAvailableLocales()));
        System.out.println("Date is = " + C.get(Calendar.DATE));
        System.out.println("Month is = " + C.get(Calendar.MONTH));
        System.out.println("Year is = " + C.get(Calendar.YEAR));

        System.out.println("Hour is = " + C.get(Calendar.HOUR));
        System.out.println("Minute is = " + C.get(Calendar.MINUTE));
        System.out.println("Second is = " + C.get(Calendar.SECOND));

        System.out.println("Digital Clock = " + C.get(Calendar.HOUR_OF_DAY) + ":"
                + C.get(Calendar.MINUTE) + ":" + C.get(Calendar.SECOND));

        System.out.println("Day of Week is = "+ C.get(Calendar.DAY_OF_WEEK));

        System.out.println("Current date is : " + C.getTime());
        C.add(Calendar.YEAR, 4);
        System.out.println("After 4 years  : "+ C.getTime());
        C.add(Calendar.YEAR, -12);
        System.out.println("Before 12 years  : "+ C.getTime());
        C.add(Calendar.MONTH,2);
        System.out.println("After 2 months  : "+ C.getTime());

        System.out.println("Weeks In Week Year = " + C.getWeeksInWeekYear());

        System.out.println("The maximum no. of weeks in a year : " + C.getMaximum(Calendar.WEEK_OF_YEAR));
    }
}
