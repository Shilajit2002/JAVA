import java.util.Scanner;

public class Loop_all {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // While Loop
        int x = 0;
        while (x < 10) {
            System.out.println(x);
            x++;
        }
        System.out.println("--------");
        // Quick Quiz
        int y = 100;
        while (y <= 200) {
            System.out.println(y);
            y++;
        }
        System.out.println("--------");

        // do-while Loop
        int a = 10;
        do {
            System.out.println(a);
        } while (a > 11);
        System.out.println("--------");
        // Quick Quiz
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
        System.out.println("--------");

        // For Loop
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
        System.out.println("--------");
        // Quick Quiz
        for (int j = 0; j < n; j++) {
            System.out.println(2 * j + 1);
        }
        System.out.println("--------");

        // Decrementing For Loop
        for (int j = 20; j >= 0; j--) {
            System.out.println(j);
        }
        System.out.println("--------");
        // Quick Quiz
        for (int j = n; j >= 0; j--) {
            System.out.println(j);
        }
        System.out.println("--------");

        // Break Statement
        for (int s = 0; s < 10; s++) {
            if (s == 5) {
                break;
            }
            System.out.println(s);
        }
        System.out.println("--------");

        // Continue Statement
        for (int s = 0; s < 10; s++) {
            if (s == 5) {
                continue;
            }
            System.out.println(s);
        }
    }
}