import java.util.*;
import java.lang.*;
import java.io.*;

class Matches {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int[] match = new int[]{6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int T = sc.nextInt();
        long A, B, C;
        while (T > 0) {
            A = sc.nextLong();
            B = sc.nextLong();
            C = A + B;
            int[] arr = new int[String.valueOf(C).length()];
            int i = String.valueOf(C).length() - 1;
            int sum = 0;
            while (C > 0) {
                long l = C % 10;
                arr[i] = match[(int) l];
                sum += arr[i];
                i--;
                C = C / 10;
            }
            System.out.println(sum);
            T--;
        }
    }
}
