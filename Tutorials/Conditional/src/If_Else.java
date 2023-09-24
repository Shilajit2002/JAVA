import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();

        // If Else Statement
        if (age >= 18) {
            System.out.println("** You Can Drive **");
        } else {
            System.out.println("`~` You Can't Drive `~`");
        }

        boolean code = (age != 18);
        if (code) {
            System.out.println("You are Not 18");
        } else {
            System.out.println("You are 18");
        }

        // If Else Ladder
        System.out.print("Enter Your Age : ");
        int no = sc.nextInt();
        if (no < 18) {
            System.out.println("You are Not Adult");
        } else if (no >= 18) {
            System.out.println("You are Adult");
        } else {
            System.out.println("None");
        }

        // Short Hand If-Else
        int x = 10;
        String result = (x < 18) ? "Your are Children" : "You are sre not Children";
        System.out.println(result);
    }
}
