import java.util.Scanner;

public class Primes_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total no. = ");
        int a = sc.nextInt();

        boolean flag;

        System.out.println("Prime Numbers Between 2 to " + a);

        for (int n = 2; n <= a; n++) {
            flag = true;
            int m = (int) Math.sqrt(n);
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("\t" + n);
            }
        }
    }
}
