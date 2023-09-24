package Unchecked.Runtime;

public class Arithmetic {
    public static void main(String[] args) {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
