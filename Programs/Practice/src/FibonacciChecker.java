class Fibonacci {
    public int fibo(int f) {
        if (f == 0 || f == 1) {
            return f;
        }
        int first = 0, second = 1, sum = 0;

        for (int i = 1; i <= f; i++) {
            sum = first + second;
            first = second;
            second = sum;
            if (sum == f) {
                return f;
            }
        }
        return -1;
    }
}

public class FibonacciChecker {
    public static void main(String[] args) {
        Fibonacci F = new Fibonacci();

        int n = Integer.parseInt(args[0]);

        if (F.fibo(n) == n) {
            System.out.println(n + " is a Fibonacci Number");
        } else {
            System.out.println(n + " is a not Fibonacci Number");
        }
    }
}
