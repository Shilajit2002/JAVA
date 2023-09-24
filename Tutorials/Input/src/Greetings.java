import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String a = sc.next();
        System.out.print("Hello " + a + " , have a good day");
    }
}
