import java.util.Scanner;

public class Fibonacci_goldenratio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, a = 0, b = 1, c;
        float goldenratio;

        System.out.print("Enter the total no. = ");
        n = sc.nextInt();

        System.out.println("Fibonacci Numbers\tGolden Ratio");
        if (n >= 1) {
            System.out.printf("\t%d\t\t\t\t\t-\n", a);
        }
        if (n >= 2) {
            System.out.printf("\t%d\t\t\t\t\t-\n", b);
        }

        for (int i = 3; i <=n; i++) {
            c = a + b;
            goldenratio = ((float) c / (float) b);
            System.out.printf("\t%d\t\t\t\t\t%.3f\n", c, goldenratio);
            a = b;
            b = c;
        }
    }
}
