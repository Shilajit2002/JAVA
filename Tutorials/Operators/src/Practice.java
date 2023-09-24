import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int y = 7, x = ++y * 8;
        System.out.println("Value of x = " + x);

        // Question 1
        System.out.println("--------Question 1--------");
        System.out.println(7 / 4 * 9 / 2);

        // Question 2
        System.out.println("--------Question 2--------");
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);
        grade = (char) (grade - 8);
        System.out.println(grade);

        // Question 3
        System.out.println("--------Question 3--------");
        Scanner S = new Scanner(System.in);

        System.out.print("Enter a Number = ");
        int a = S.nextInt();
        System.out.println(a > 10);

        // Question 4
        System.out.println("--------Question 4--------");
        System.out.print("Enter value of v = ");
        Float v = S.nextFloat();
        System.out.print("Enter value of u = ");
        Float u = S.nextFloat();
        System.out.print("Enter value of a = ");
        Float aa = S.nextFloat();
        System.out.print("Enter value of s = ");
        Float s = S.nextFloat();

        System.out.println("(v^2-u^2)/2as = "+(v * v - u * u) / (2 * aa * s));

        // Question 5
        System.out.println("--------Question 5--------");
        System.out.println("a = "+(7*49/7+35/7));
    }
}
