import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Importing Scanner Class
        Scanner sc = new Scanner(System.in);

        int n, fact = 1;
        System.out.print("Enter the Number = ");
        n = sc.nextInt();
        // Factorial Iteration
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is = " + fact);
    }
}

