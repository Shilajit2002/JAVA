import java.util.Scanner;

public class Kilo_Mile {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Kilometre = ");
        float kilo = S.nextFloat();
        System.out.println("Mile = " + kilo * 0.621371);
    }
}
