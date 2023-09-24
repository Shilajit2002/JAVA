import java.util.Scanner;

public class CBSE_Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st no. = ");
        float num1 = sc.nextFloat();
        System.out.print("Enter 2nd no. = ");
        float num2 = sc.nextFloat();
        System.out.print("Enter 3rd no. = ");
        float num3 = sc.nextFloat();
        System.out.print("Enter 4th no. = ");
        float num4 = sc.nextFloat();
        System.out.print("Enter 5th no. = ");
        float num5 = sc.nextFloat();

        float perc = (num1 + num2 + num3 + num4 + num5) / 5;

        System.out.print("Percentage = " + perc + "%");
    }
}
