import Arithmetic.Calculator;

public class User {
    public static void main(String[] args) {
        Calculator A = new Calculator();
        System.out.println(A.Addition(10,5));
        System.out.println(A.Subtraction(10,5));
        System.out.println(A.Multiplication(10,5));
        System.out.println(A.Division(10,5));
    }
}