import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1
        System.out.println("--------Question 1--------");
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        // Question 2
        System.out.println("--------Question 2--------");
        System.out.print("Enter N =  ");
        int n = sc.nextInt();
        int sum = 0, i = 0;
        while (i <= n) {
            sum += 2 * i;
            i++;
        }
        System.out.println("Sum is = " + sum);

        // Question 3
        System.out.println("--------Question 3--------");
        System.out.println("Multiplication Table of " + n + " is :");
        for (int d = 1; d <= 10; d++) {
            System.out.println(n + " X " + d + " = " + (n * d));
        }

        // Question 4
        System.out.println("--------Question 4--------");
        System.out.println("Multiplication Table of 10 in Reverse Order :");
        for (int d = 10; d > 0; d--) {
            System.out.println("10 X " + d + " = " + (10 * d));
        }

        // Question 5
        System.out.println("--------Question 5--------");
        int fact = 1;
        for (int f = 1; f <= n; f++) {
            fact *= f;
        }
        System.out.println("Factorial of " + n + " is = " + fact);

        // Question 6
        System.out.println("--------Question 6--------");
        fact = 1;
        int f = 1;
        while (f <= n) {
            fact *= f;
            f++;
        }
        System.out.println("Factorial of " + n + " is = " + fact);

        // Question 7
        System.out.println("--------Question 7--------");
        int g = 4, h;
        while (g > 0) {
            h = 0;
            while (h < g) {
                System.out.print("* ");
                h++;
            }
            System.out.print("\n");
            g--;
        }

        // Question 8
        // True

        // Question 9
        System.out.println("--------Question 9--------");
        int add = 0;
        for (int j = 0; j <= 10; j++) {
            add += 8 * j;
        }
        System.out.println("Sum = " + add);

        // Question 10
        // At least Once

        // Question 11
        System.out.println("--------Question 11--------");
        sum = 0;
        for (int j = 0; j <= n; j++) {
            sum += 2 * j;
        }
        System.out.println("Sum = " + sum);
    }
}
