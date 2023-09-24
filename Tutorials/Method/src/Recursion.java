import java.util.Scanner;

public class Recursion {

    // Factorial Method
    public long factorial(long n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursion Factorial Self Calling Method
            long fact = n * factorial(n - 1);

            return fact;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. = ");
        long n = sc.nextLong();

        Recursion r = new Recursion();

        System.out.println("Factorial of " + n + " is = " + r.factorial(n));
    }
}
