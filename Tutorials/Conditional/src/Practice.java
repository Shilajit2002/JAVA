import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Question 1
        /*
         * int a=10;
         * if(a=11) // This is an error because a=11 is wrong a==11 is correct so a=11
         * is showing error
         * System.out.println("I am 11");
         * else
         * System.out.println("I am not 11");
         */

        // Question 2
        System.out.println("--------Question 2--------");
        int phy, math, chem;
        System.out.print("Enter Physics Mark = ");
        phy = sc.nextInt();
        System.out.print("Enter Math Mark = ");
        math = sc.nextInt();
        System.out.print("Enter Chemistry Mark = ");
        chem = sc.nextInt();

        float avg = (phy + math + chem) / 3.0f;
        System.out.println("Your Overall Percentage is = " + avg);
        if (avg >= 40 && phy >= 33 && math >= 33 && chem >= 33) {
            System.out.println("** You are Passed **");
        } else {
            System.out.println("`~` You are Fail `~`\nBetter Luck Next Time");
        }

        // Question 3
        System.out.println("--------Question 3--------");
        System.out.print("Enter Your Income in Lacs = ");
        float tax = 0f;
        float income = sc.nextFloat();

        if (income <= 2.5f) {
            tax += 0f;
        } else if (income > 2.5f && income <= 5.0f) {
            tax += 0.05f * (income - 2.5f);
        } else if (income > 5.0f && income <= 10.0f) {
            tax += 0.05f * (5.0f - 2.5f);
            tax += 0.2f * (income - 5.0f);
        } else {
            tax += 0.05f * (5.0f - 2.5f);
            tax += 0.2f * (10.0 - 5.0f);
            tax += 0.3 * (income - 10.0f);
        }

        System.out.println("The total tax paid by the employee is: " + tax);

        // Question 4
        System.out.println("--------Question 4--------");
        System.out.print("Enter a Digit of the Day = ");
        int day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Not Match..Enter Digit Between 1 to 7");
        }

        // Question 5
        System.out.println("--------Question 5--------");
        System.out.print("Enter a Year = ");
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is Not a Leap Year");
        }

        // Question 6
        System.out.println("--------Question 6--------");
        System.out.print("Enter Your Website Name = ");
        String web = sc.next();

        if (web.endsWith(".com")) {
            System.out.println("This is a Commercial Website");
        } else if (web.endsWith(".org")) {
            System.out.println("This is an Organisation Website");
        } else if (web.endsWith(".in")) {
            System.out.println("This is an Indian Website");
        } else {
            System.out.println("Not Match");
        }
    }
}
