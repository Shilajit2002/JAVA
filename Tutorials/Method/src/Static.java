import java.util.*;

public class Static {

    // Using Static Keyword
    // Return Type Int
    // mySum Method
    public static int mySum(int a, int b) {
        int c = a + b;
        return c;
    }

    // mySub Method no return type
    public static void mySub(int a, int b) {
        int c = a - b;
        System.out.println("Sub = " + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("Enter a & b = ");
        a = sc.nextInt();
        b = sc.nextInt();

        // Direct call the static method not need to create object
        System.out.println("Sum = " + mySum(a, b));
        mySub(a, b);
    }
}
