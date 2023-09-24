import java.util.Date;

public class DateDriver {
    public static void main(String[] args) {
        //  No. of milliseconds passed from 1 Jan 1900 to current
        System.out.println("No. of milliseconds passed from 1 Jan 1900 to current is = " + System.currentTimeMillis());

        //  Create Date Object
        Date d = new Date();

        System.out.println("Date Time is = " + d);

        //  All are Deprecated Method
        System.out.println("Date is = " + d.getDate());
        System.out.println("Month is = " + d.getMonth());
        System.out.println("How many years passed from 1 jan 1900 to current = " + d.getYear());
        System.out.println("Day is = " + d.getDay());
        System.out.println("Hour is = " + d.getHours());
        System.out.println("Minute is = " + d.getMinutes());
        System.out.println("Second is = " + d.getSeconds());

        System.out.println("----Date Constructors----");

        //  Date Constructors
        Date d1 = new Date(3025, 10, 5, 6, 40, 12);
        System.out.println("Date is = " + d1.getDate());
        System.out.println("Month is = " + d1.getMonth());
        System.out.println("Year is = " + d1.getYear());
        System.out.println("Hour is = " + d1.getHours());
        System.out.println("Minute is = " + d1.getMinutes());
        System.out.println("Second is = " + d1.getSeconds());
        System.out.println("Day is = " + d1.getDay());

        //  Quick Quiz
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
        //  Yes it is safe to store
        Long a = System.currentTimeMillis();
        System.out.println(a);
    }
}
