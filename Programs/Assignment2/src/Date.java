import java.util.Scanner;

class Date {
    private int day;
    private int month;
    private int year;

    //  Default  Constructor Initialize
    public Date() {
        month = 1;
        day = 1;
        year = 1800;
    }

    //    Constructor Initialize
    public Date(int d, int m, int y) {
        setMonth(m);
        setDay(d);
        setYear(y);
    }

    //    Mutator Method
    public void setDay(int d) {
        // Check the date is correct or not
        if (d < 1 || d > daysOfMonth(month)) {
            day = 1;
        } else {
            day = d;
        }
    }

    public void setMonth(int m) {
        // Check the month is correct or not
        if (m < 1 || m > 12) {
            month = 1;
        } else {
            month = m;
        }
    }

    public void setYear(int y) {
        // Check the year is correct or not
        if (y < 1800 || y > 3000) {
            year = 1800;
        } else {
            year = y;
        }
    }

    //    Accessor Method
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    //    Check the year is leap year or not
    private boolean isLeapyear(int y) {
        return ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0));
    }

    //    Days of Month Method
    private int daysOfMonth(int m) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // Check the year leap year or not
        if (isLeapyear(m)) {
            days[1] = 29;
        }
        return days[m - 1];
    }

    //    Next Day Method
    private void nextDay() {
        // Check the day is last day or not
        if (day == daysOfMonth(month)) {
            day = 1;
            month++;
            // Check the month is last month or not
            if (month == 13) {
                month = 1;
                year++;
            }
        } else {
            day++;
        }
    }

    //    Previous Day Method
    private void prevDay() {
        // Check the day is first day or not
        if (day == 1) {
            month--;
            // Check the month is first month or not
            if (month == 0) {
                month = 12;
                year--;
            }
            day = daysOfMonth(month);
        } else {
            day--;
        }
    }

    //    Increment date Method
    public void incrementDate(int n) {
        for (int i = 1; i <= n; i++) {
            nextDay();
        }
    }

    //    Decrement Date Method
    public void decrementDate(int n) {
        for (int i = 1; i <= n; i++) {
            prevDay();
        }
    }

    //    ToString Method
    public String toString() {
        return day + "/" + month + "/" + year;
    }

    // Equal Method
    public boolean equals(Object O) {
        if (O instanceof Date) {
            Date D = (Date) O;
            if (this.day == D.day && this.month == D.month && this.year == D.year) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // Number of Days Difference Method
    private int noOfDaysDifference() {
        Date d = new Date();

        int daydiff = 0;

        for (; d.year < year; (d.year)++) {
            if (d.isLeapyear(d.year)) {
                daydiff += 366;
            } else {
                daydiff += 365;
            }
        }
        for (; d.month < month; (d.month)++) {
            daydiff += d.daysOfMonth(d.month);

        }

        daydiff += day;
        return daydiff;
    }

    // Difference two Date Method
    public int difference(Date D) {
        int firstDate = this.noOfDaysDifference();
        int secondDate = D.noOfDaysDifference();
        return Math.abs(firstDate - secondDate);
    }

}


class Driver4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d, m, y, d1, m1, y1, in, de;

        System.out.print("Enter Day : ");
        d = sc.nextInt();
        System.out.print("Enter Month : ");
        m = sc.nextInt();
        System.out.print("Enter Year : ");
        y = sc.nextInt();

        Date D1 = new Date(d, m, y);

        System.out.println("-----------------------------------------------");

        System.out.print("Increase N day of the Date " + D1 + " : ");
        in = sc.nextInt();
        D1.incrementDate(in);
        System.out.println("After Increase " + in + " day the Date is : " + D1);

        System.out.println("-----------------------------------------------");

        System.out.print("Decrease N day of the Date " + D1 + " : ");
        de = sc.nextInt();
        D1.decrementDate(de);
        System.out.println("After Decrease " + de + " day the Date is : " + D1);

        System.out.println("-----------------------------------------------");

        System.out.print("Enter Another Day : ");
        d1 = sc.nextInt();
        System.out.print("Enter Another Month : ");
        m1 = sc.nextInt();
        System.out.print("Enter Another Year : ");
        y1 = sc.nextInt();

        Date D2 = new Date(d1, m1, y1);

        System.out.println("-----------------------------------------------");

        // Equality Check
        if (D1.equals(D2)) {
            System.out.println(D1 + " Equal " + D2);
        } else {
            System.out.println(D1 + " Not Equal " + D2);
        }

        System.out.println("-----------------------------------------------");

        System.out.println("Difference between " + D1 + " & " + D2 + " : " + D1.difference(D2));
    }
}
