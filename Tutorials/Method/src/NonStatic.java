import java.util.*;

public class NonStatic {

    // Not Using Static Keyword
    // Return Type Int
    // mySum Method
    public int mySum(int a, int b) {
        int c = a + b;
        return c;
    }

    // mySub Method no return type
    public void mySub(int a, int b) {
        int c = a - b;
        System.out.println("Sub = " + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("Enter a & b = ");
        a = sc.nextInt();
        b = sc.nextInt();

        // Creating an Object t of class NonStatic
        NonStatic t=new NonStatic();

        System.out.println("Sum = " + t.mySum(a, b));
        // Calling method by Object
        t.mySub(a, b);
    }
}
